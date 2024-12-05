package com.day2;

public class Typesofvariable {
	
	int b=20; // object /instance variable
	static int c = 30;

	public static void main(String[] args) {
		int  a=10; //local variable
		
		Typesofvariable obj = new Typesofvariable();
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(Typesofvariable.c);
		
		
		

	}

}
