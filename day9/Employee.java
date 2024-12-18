package com.day9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	transient private int empId;
	private String name;
	private double salary;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) throws Exception{
		//Serialization.
		Employee obj1 = new Employee(100 , "gokul" , 10000);
		FileOutputStream fout = new FileOutputStream("D://Serial.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj1);
		
		objout.close();
		fout.close();
		
		System.out.println("object Saved successfully");
		
		
		//De-serialization
		FileInputStream fin = new FileInputStream("D://Serial.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee obj2 =(Employee) objin.readObject();
		
		fin.close();
		objin.close();
		
		System.out.println("Object retrived Successfully");
		
		System.out.println("Employee id :" + obj2.getEmpId());
		System.out.println("Employee name :" + obj2.getName());
		System.out.println("Employee Salary :" + obj2.getSalary());
		

	}

}
