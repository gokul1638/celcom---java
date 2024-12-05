package com.day2;

public class Staticvariable {
	static int a=20;
	
	public static void main(String[] args) {
		
		Staticvariable obj1 = new Staticvariable();
		Staticvariable obj2 = new Staticvariable();
		
		System.out.println("value of a: " + obj1.a);
		System.out.println("value of b: " + obj2.a);
		
		obj1.a=50;
		System.out.println("value of a: " + obj1.a);
		System.out.println("value of b: " + obj2.a);
		
	}

}
