package com.day3;

class A
{
	A()
	{
		System.out.println("hi from no parameter constructor of A class");
	}
	A(int a)
	{
		System.out.println("hi from  parameter constructor of A class");
	}
	
}

class B extends A
{
	B()
	{
		super(10);
		System.out.println("hi from no parameter constructor of B class");
	}
	
	B(int c)
	{
		System.out.println("hi from parameter constructor of B class");
	}
	
}

public class ConstructorInvocationorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();

	}

}
