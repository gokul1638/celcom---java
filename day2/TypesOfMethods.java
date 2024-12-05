package com.day2;

public class TypesOfMethods {
	void display()
	{
		System.out.println("hi from non-static method");
	}
	
	static void display1()
	{
		System.out.println("hi from static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesOfMethods obj = new TypesOfMethods();
		obj.display();
		TypesOfMethods.display1();

	}

}
