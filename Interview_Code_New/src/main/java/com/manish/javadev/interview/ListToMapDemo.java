package com.manish.javadev.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapDemo {
	public static void main(String[] args) {
		List<Animal> list = new ArrayList<Animal>();
		Animal animal1 = new Animal("Manish1", 1);
		Animal animal2 = new Animal("Manish2", 2);
		Animal animal3 = new Animal("Manish3", 3);
		Animal animal4 = new Animal("Manish4", 4);
		Animal animal5 = new Animal("Manish5", 5);
		list.add(animal1);
		list.add(animal2);
		list.add(animal3);
		list.add(animal4);
		list.add(animal5);
		Map<Integer, Animal> map = convertListToMap(list);
		System.out.println(map);

		System.out.println("======");
		List<Student> list1 = new ArrayList<Student>();
		Student student = new Student(10, "Manish1", "Math", new Double(10));
		Student student1 = new Student(20, "Manish2", "Science", new Double(20));
		Student student2 = new Student(30, "Manish3", "Math", new Double(30));
		Student student3 = new Student(40, "Manish4", "Math", new Double(10));
		Student student4 = new Student(50, "Manish5", "Science", new Double(20));
		Student student5 = new Student(60, "Manish6", "DAA", new Double(30));
		Student student6 = new Student(70, "Manish7", "DAA", new Double(30));
		list1.add(student);
		list1.add(student1);
		list1.add(student2);
		list1.add(student3);
		list1.add(student4);

		list1.add(student5);
		list1.add(student6);

		Map<Integer, Student> collect = list1.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
		System.out.println(collect);

		Map<String, Double> collect2 = list1.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.summingDouble(Student::getSalary)));
		System.out.println(collect2);
	}

	private static Map<Integer, Animal> convertListToMap(List<Animal> list) {
		return list.stream().collect(Collectors.toMap(Animal::getId, Function.identity()));
	}
}
