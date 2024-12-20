package com.day11;

@FunctionalInterface
interface ForMethodReferance {
	void showMessage();
}

public class MethodReferanceExample {

	void myInstanceMethod() {
		System.out.println("Hi from instance method");
	}

	static void staticMethod() {
		System.out.println("Hi from static method");
	}

	MethodReferanceExample() {
		System.out.println("Hi from constructor");
	}

	public static void main(String[] args) {
		MethodReferanceExample obj = new MethodReferanceExample();
		ForMethodReferance referance = obj::myInstanceMethod;
		referance.showMessage();
		
		referance = MethodReferanceExample :: staticMethod;
		referance.showMessage();
		
		referance = MethodReferanceExample :: new;
		referance.showMessage();
		

	}

}
