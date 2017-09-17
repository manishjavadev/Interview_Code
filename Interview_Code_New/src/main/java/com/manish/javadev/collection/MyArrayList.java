package com.manish.javadev.collection;

import java.util.Arrays;

public class MyArrayList {
	private int size;
	private int capacity;
	private Object elementData[];

	public MyArrayList() {
		size = 0;
		capacity = 10;
		elementData = new Object[capacity];
	}

	public boolean add(Object data) {
		if (size == capacity) {
			grow();
		}
		elementData[size++] = data;
		return true;
	}

	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return elementData[index];
	}

	private void grow() {
		Object temp[] = elementData;
		capacity = capacity * 3 / 2 + 1;
		elementData = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			elementData[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(5);
		myArrayList.add(6);
		myArrayList.add(7);
		myArrayList.add(8);
		myArrayList.add(9);
		myArrayList.add(10);
		myArrayList.add(11);
		myArrayList.add(12);
		myArrayList.add(13);
		// System.out.println(myArrayList);
		System.out.println(myArrayList.get(12));
	}

	@Override
	public String toString() {
		return "MyArrayList [elementData=" + Arrays.toString(elementData) + "]";
	}

}
