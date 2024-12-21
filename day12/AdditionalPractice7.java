//7. Sort the Employee object using salary

package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;

		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class AdditionalPractice7 {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(101, "gokul", 3000),
				new Employee(102, "bharath", 2000),
				new Employee(103, "praveen", 4000)
				);
				List<Employee> sortList = empList.stream()
						.sorted((e1, e2) -> e1.salary - e2.salary)
						.collect(Collectors.toList());
				System.out.println(sortList);

	}

}
