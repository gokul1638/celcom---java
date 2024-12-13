package com.day5;

interface My {
	void method1();
}

interface Myinter extends My {
	void method2();
}

class Implementation2 implements Myinter {
	public void method1() {
		System.out.println("hi from method 1");
	}

	public void method2() {
		System.out.println("hi from method 2");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation2 var = new Implementation2();
		var.method1();
		//var.method2();
	}

}
