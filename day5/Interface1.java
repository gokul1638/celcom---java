package com.day5;

interface Myinterface1 {
	void method1();
}

interface Myinterface2 {
	void method2();
}

class Implementation1 implements Myinterface1 , Myinterface2 {
	public void method1() {
		System.out.println("hi from method 1");
	}

	public void method2() {
		System.out.println("hi from method 2");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation1 var = new Implementation1();
		var.method1();
		var.method2();
	}

}
