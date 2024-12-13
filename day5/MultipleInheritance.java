package com.day5;


interface One
{
	int a=10;
}
interface Two
{
	int b=20;
}

interface Three extends One , Two
{
	void add();
}
class Normal implements Three
{
	public void add()
	{
		System.out.println("The sum is " + (a+b));
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Normal var = new Normal ();
		var.add();

	}

}
