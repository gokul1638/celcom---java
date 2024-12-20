package com.day11;

interface Java8Interface1
{
	void method();
	
	static void staticMethod() {
		System.out.println("Hi from static method");
	}
	
	default void defaultMethod() {
		System.out.println("Hi from default method");
	}
}

public class Java8Interface implements Java8Interface1{

	public static void main(String[] args) {
		
		Java8Interface1 ref = new Java8Interface();
		ref.defaultMethod();
		Java8Interface1.staticMethod();
		

	}

	@Override
	public void method() {
		System.out.println("Hi from method");
		
	}

}
