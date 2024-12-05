package com.day2;

class Employee
{
	int id;
	String name;
	float Salary;
	
	Employee(int id, String name , float sal)
	{
		this.id=id;
		this.name=name;
		this.Salary=sal;
	}
	
	void display()
	{
		System.out.println("Employee id : " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee Salary: " + Salary);
	}
}

public class Objectandclass {

	public static void main(String[] args) {
		
		Employee gokul = new Employee(10, "gokul" , 10000  );
		gokul.display();
		
		Employee praveen = new Employee(11,"praveen",100000);
		praveen.display();

	}

}
