package com.manish.javadev.interview.clone;

public class Employee implements Cloneable {
	private String name;
	private int id;
	private Address address;

	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		/**
		 * Default shallow clone
		 */
		// return super.clone();
		Employee employee = (Employee) super.clone();
		employee.setAddress((Address) address.clone());
		return employee;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
