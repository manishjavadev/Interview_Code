package com.manish.javadev.collection;

/**
 * @author Manish
 *
 */

/**
 * THis program creating our own Stack feature like collection classes.
 * But this is user defined Stack 
 * Note: Stack means First in last out
 * Note: this is dynamic stack because once the size of array is full
 * it will call alterCapacity method and alter the size of array with double capacity
 * and do the operation
 */
public class MyOwnStack {
	
	private int size;
	private int capacity;
	private Object elements[];
	public MyOwnStack(){
		capacity=10;
		elements= new Object[capacity];
		
	}
	public void addObject(Object obj){
		if(size==10){
			alterCapacity();
		}
		elements[size++]=obj;
	}
	//Here i am altering the capacity of array
	// and copying array element in to temp array
	//and creating new array with modified size and 
	// and again copying temp array in again in new modified(size) array
	
	private void alterCapacity(){
		capacity=capacity*2;
		Object temp[]= elements;
		elements= new Object[capacity];
		for(int i=0;i<temp.length;i++){
			elements[i]=temp[i];			
		}	
	}
	//Here is a removing element from stack
	public Object removeObjectFromStack(){
		return elements[--size];
	}
	public Object removeObjectFromQueue(){
		Object obj = elements[0];
		for(int i=0;i<size;i++){
			elements[i]=elements[i+1];						
		}
		size--;
		return obj;
	}
	
	public String toString() {
		StringBuffer sb= new StringBuffer("[");
		for(int i=0;i<size;i++){
			sb.append(elements[i]+",");						
		}
		return sb.substring(0,sb.length()-1)+"]";		
	}
}
class TestMyStack{
	
	public static void main(String[] args) {
	
		MyOwnStack s1= new MyOwnStack();
		s1.addObject("abc");
		s1.addObject("123");
		s1.addObject("bcd");
		System.out.println(s1);
		//Here i am calling remove method of Stack
		System.out.println(s1.removeObjectFromStack());
		System.out.println(s1);
		s1.addObject("433");
		s1.addObject("hello");
		//Here i am again calling remove method of Stack 
		//after adding new object
		System.out.println(s1);
		System.out.println(s1.removeObjectFromStack());
		System.out.println(s1);		
	}
}
