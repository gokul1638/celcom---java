package com.day4;

class Animal
{
	void data()
	{
		System.out.println("hi from animal");
	}
}

class Dog extends Animal
{
	void data ()
	{
		System.out.println("hi from dog");
	}
}
public class DynamicMethodDispatch {
	
	public static void main(String[] args) {
		Animal obj = new Dog();
		
		obj.data();
	}

}
