package com.day5;

abstract class Vehicle1 {
	void noOfEngine() {
		System.out.println("i have one engine");
	}

	abstract void wheels();

	abstract void brand();
}

class Bike1 extends Vehicle1 {
	static {
		System.out.println("\t\t\tHi ,I am a bike");
	}

	void wheels() {
		System.out.println("\t\t\tI have two wheels");

	}

	void brand() {
		System.out.println("\t\t\tI am from yamaha brand");
	}
}

class Car1 extends Vehicle1 {

	static {
		System.out.println("\t\t\tHI,I am a car");
	}

	void wheels() {
		System.out.println("\t\t\tI have four wheels");
	}

	void brand() {
		System.out.println("\t\t\tI am from skoda brand");
	}
}

public class Abstractclassexample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Vehicle1 veh;
		Vehicle1 bike = new Bike1();
		//Thread.sleep(3000);
		veh = bike;
		veh.wheels();
		//Thread.sleep(3000);
		veh.brand();
		

		
		
	}

}
