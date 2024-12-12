package com.day4;

public class Singletonclass {
	
	public static void main(String[] args) {
		 
		Employee emp = Employee.getEmployee();
		emp.display();
		System.gc();
		Runtime.getRuntime().gc();
 
	}

}

class Employee {
	private static Employee emp = null;
	
	private Employee() {
		System.out.println("Hi from private constructor");
	}
	
 
	public static Employee getEmployee() {
		if (emp == null) {
			emp = new Employee();
		} else {
			emp = null;
		}
		return emp;
	}
 
	public void display() {
		System.out.println("Hi From display method");
	}
}
 