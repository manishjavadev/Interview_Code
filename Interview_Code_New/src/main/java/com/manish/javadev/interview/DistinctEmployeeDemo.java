package com.manish.javadev.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistinctEmployeeDemo {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList();
		Employee emp1 = new Employee("Manish1", 100);
		Employee emp2 = new Employee("Manish2", 200);
		Employee emp3 = new Employee("Manish3", 100);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		DistinctEmployeeDemo employee2 = new DistinctEmployeeDemo();
		HashSet<Employee> removeDuplicate = employee2.removeDuplicate(list);
		removeDuplicate.forEach(emp -> {
			System.out.println(emp.getName());
		});

	}

	HashSet<Employee> removeDuplicate(List<Employee> list) {
		HashSet<Employee> resultList = new HashSet(list);
		for (Employee emp : list) {
			resultList.add(emp);
		}
		return resultList;
	}
}
