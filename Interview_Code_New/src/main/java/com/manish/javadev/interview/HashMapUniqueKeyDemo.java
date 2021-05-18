package com.manish.javadev.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapUniqueKeyDemo {
	private Object[] internal = {};

	public static void main(String[] args) {
		Employee1 employee1 = new Employee1(100, "Manish");
		Employee1 employee2 = new Employee1(100, "Manish");
		Employee1 employee3 = new Employee1(200, "Manish");
		HashMap<Employee1, Integer> hashMap = new HashMap<Employee1, Integer>();
		hashMap.put(employee1, 100);
		hashMap.put(employee2, 200);
		hashMap.put(employee3, 300);
		System.out.println("Result  ::" + hashMap);
		Set<Employee1> keySet = hashMap.keySet();
		Iterator<Employee1> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Employee1 employee = (Employee1) iterator.next();
			System.out.println(employee);

		}
	}

	private void test() {
		System.out.println(internal.length);

	}

}

class Employee1 {
	private int id;
	private String name;

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
