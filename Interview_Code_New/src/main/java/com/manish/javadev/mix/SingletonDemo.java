package com.manish.javadev.mix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		obj.i = 5;
		serializeMe();
		obj.i = 10;
		Singleton st = (Singleton) deSerializeMe();
		System.out.println("After Deserialization : " + st);
	}

	public static void serializeMe() {
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
			oos.writeObject(Singleton.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object deSerializeMe() {
		ObjectInputStream oin = null;
		Object obj = null;
		try {
			oin = new ObjectInputStream(new FileInputStream("abc.txt"));
			obj = oin.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return obj;
	}

}

class Singleton implements Serializable {
	int i;
	private static Singleton obj = null;

	private Singleton() {
		System.out.println("Executing constructor");
		i = 1;
	}

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		System.out.println("An instance is returned");
		return obj;
	}

	public Object readResolve() {
		System.out.println("Executing readResolve");
		return Singleton.getInstance(); // FIXME
	}
}