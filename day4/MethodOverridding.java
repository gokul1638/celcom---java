package com.day4;
class Vehicle
{
	void noOfWheels()
	{
		System.out.println("i can have any number of wheels");
	}
	void noOfEngine()
	{
		System.out.println("i have one engine");
	}
}

class TwoWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("i have two wheels");
	}
}

public class MethodOverridding {
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		Vehicle name = new Vehicle();
		obj.noOfEngine();
		obj.noOfWheels();
		name.noOfEngine();
		name.noOfWheels();
	}

}
