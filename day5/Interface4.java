package com.day5;

interface Vehicleplan
{
	void noOfEngine();
	void noOfWheels();
	void Brand();
}

abstract class Vehicles implements Vehicleplan
{
	public void noOfEngine()
	{
		System.out.println("I have only one Engine");
	}
}

class Bikes extends Vehicles
{

	@Override
	public void noOfWheels() {
		System.out.println("I have two wheels");
		
	}

	@Override
	public void Brand() {
		System.out.println("I am from BMW brand");
		
	}
	
}
public class Interface4 {

	public static void main(String[] args) {
		Vehicleplan var = new Bikes();
		var.noOfEngine();
		var.noOfWheels();
		var.Brand();

	}

}
