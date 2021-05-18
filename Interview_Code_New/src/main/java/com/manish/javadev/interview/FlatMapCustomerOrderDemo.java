package com.manish.javadev.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapCustomerOrderDemo {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Customer customer1 = new Customer();
		Order order1 = new Order("Order1", 1);
		Order order2 = new Order("Order2", 2);
		customer1.getOrder().add(order1);
		customer1.getOrder().add(order2);

		Customer customer2 = new Customer();
		order1 = new Order("Order1", 1);
		order2 = new Order("Order2", 2);
		customer2.getOrder().add(order1);
		customer2.getOrder().add(order2);

		Customer customer3 = new Customer();
		order1 = new Order("Order1", 1);
		order2 = new Order("Order2", 2);
		customer3.getOrder().add(order1);
		customer3.getOrder().add(order2);
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);

		List<Order> collect = list.stream().flatMap(cust -> cust.getOrder().stream()).collect(Collectors.toList());
		collect.forEach(order -> {
			System.out.println("Order Name :: " + order.getOrderName() + "  Quantity :: " + order.getOrderQuantity());

		});

		List<Set<Order>> collect2 = list.stream().map(cust -> cust.getOrder()).collect(Collectors.toList());

	}

}

class Customer {
	private String name;

	private Set<Order> order;

	public Customer() {

	}

	public Customer(String name, Set<Order> order) {
		super();
		this.name = name;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Order> getOrder() {
		if (order == null) {
			order = new HashSet<Order>();
		}
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

}

class Order {
	private String orderName;
	private int orderQuantity;

	public Order(String orderName, int orderQuantity) {
		super();
		this.orderName = orderName;
		this.orderQuantity = orderQuantity;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
}