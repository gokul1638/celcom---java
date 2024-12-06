package com.day3;

public class Encapsulation {
	private int id;
	private String name;
	private float salary;

	public Encapsulation(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Encapsulation name = new Encapsulation(10, "gokul", 100000);

		name.setName("gokul");
		name.setSalary(100000);
		System.out.println(name.getName());
		name.getSalary();// if we want to print the values which are private we have to use the getter method along with the object

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
