package com.manish.javadev.string;

/**
 * This program act as immutable class because, if you try to set same object
 * again the it not creating the object and returning the same instance it self
 *
 * @author Manish Srivastava
 */
public class MyImmutableClass {
	private final String str;

	public MyImmutableClass(String str) {
		this.str = str;
		System.out.println(str);
	}

	public String getStr() {
		System.out.println(str);
		return str;
	}

	public MyImmutableClass setStr(String str) {
		// Here we are checking existing object
		// if there returning same object else returning new Object
		if (this.str == str) {
			return this;
		} else {
			return new MyImmutableClass(str);
		}
	}

	@Override
	public String toString() {
		return "str=" + str;
	}

}

class TestMyImmutableClass {
	public static void main(String[] args) {
		MyImmutableClass myImc = new MyImmutableClass("java");
		myImc.setStr("java");
	}
}