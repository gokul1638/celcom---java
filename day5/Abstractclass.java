package com.day5;

abstract class Myclass
{
	abstract void method();
	
	void display()
	{
		System.out.println("hi from conctete method in abstract class");
	}
}
class Yourclass extends Myclass
{

	@Override
	void method() {
		// TODO Auto-generated method stub
		System.out.println("hi from inherited abstract method from subclass");
		
	}
	
}

public class Abstractclass {
	public static void main(String[] args) {
		Myclass obj = new Yourclass();
		obj.display();
		obj.method();
	}
}
