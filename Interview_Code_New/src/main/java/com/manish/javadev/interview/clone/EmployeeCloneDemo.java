package com.manish.javadev.interview.clone;

public class EmployeeCloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Bangalore", "560068");
		Employee employee = new Employee("Manish", 32, address);

		Employee cloneEmployee = (Employee) employee.clone();
		cloneEmployee.setName("Shivani");
		cloneEmployee.setId(18);
		cloneEmployee.getAddress().setCity("Mumbai");
		System.out.println(employee);
		System.out.println(cloneEmployee);
	}
}
