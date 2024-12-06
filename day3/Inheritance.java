package com.day3;

class Vehicle
{
	void noOfengine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler extends Vehicle
{
	void noOfWheelers()
	{
		System.out.println("I have two wheels");
	}
}

class Honda extends TwoWheeler
{
	void Brand()
	{
		System.out.println("brand name is honda");
	}
}

class Bajaj extends TwoWheeler
{
	void brand()
	{
		System.out.println("RS200");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Honda obj = new Honda();
		Bajaj obj1 = new Bajaj();
		
		obj.noOfengine();
		obj.noOfWheelers();
		obj.Brand();
		obj1.brand();

	}

}
