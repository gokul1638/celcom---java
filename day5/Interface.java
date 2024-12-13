package com.day5;

interface Myinterface
{
	void method1();
	void method2();
}
class Implementation implements Myinterface
{
	public void method1()
	{
		System.out.println("hi from method 1");
	}
	public void method2()
	{
		System.out.println("hi from method 2");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinterface var = new Implementation ();
		var.method1();
		var.method2();
	}

}
