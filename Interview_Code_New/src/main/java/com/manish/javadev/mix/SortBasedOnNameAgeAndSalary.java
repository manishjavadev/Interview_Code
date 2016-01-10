package com.manish.javadev.mix;

import java.util.*;

/**
 * @author Manish
 *
 */

/**
 * Note:
 * This code sort the employee record based on name age and salary but
 * first it will sort based on name if two employee name is equal then sort
 * with based on age suppose if age is also smiler then it will sort with 
 * based on salary
 *
 */
public class SortBasedOnNameAgeAndSalary implements Comparator<Employee>{
		
	public int compare(Employee o1, Employee o2) {
		//Here i am comparing employee name using compareTo method 
		//which return integer number if name is equal the check
		//age if age is also equal the check salary 
		int com = o1.getEname().compareTo(o2.getEname());
		if (com != 0)
			return com;
		else if (o1.getAge() - o2.getAge() != 0) {
			return o1.getAge() - o2.getAge();
		} else {
			return (int) (o1.getSalary() - o2.getSalary());
		}
	}
}

class Employee{
	private String ename;
	private Integer age;
	private Double salary;
	public Employee(String ename, Integer age, Double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age
				+ ", salary=" + salary + "]";
	}	
}
class EmployeeManager {

	public static void main(String[] args) {

		//Here i am generating list which is employee type and
		//adding employee object
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Ashish", new Integer(37), new Double(373727)));
		list.add(new Employee("Ashish", new Integer(37), new Double(373)));
		list.add(new Employee("Rakesh", new Integer(37), new Double(373727)));

		list.add(new Employee("Sakal", new Integer(25), new Double(3434737)));
		list.add(new Employee("Manish", new Integer(26), new Double(373727)));
		list.add(new Employee("Manish", new Integer(37), new Double(373727)));
		
		//In collections class one sort method is there which taking two argument 
		//one list one one comparator type so here 
		//SortBasedOnNameAgeAndSalary is comparator type note: sortimg in assending
		
		Collections.sort(list, new SortBasedOnNameAgeAndSalary());
		System.out.println("after Sorting" + list);
		// Here i am iterating list and getting sorted result
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}

