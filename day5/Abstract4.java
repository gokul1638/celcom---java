package com.day5;

import com.day5.Rectangle;
import com.day5.Shapes;
import com.day5.Square;
import com.day5.Triangle;

abstract class Shapes {
	int length;
	int breadth;
	int side;
	int height;

	public Shapes(int length, int breadth) {

		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(int side) {

		this.side = side;
	}

	public Shapes(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	abstract void area();

}

class Rectangle extends Shapes {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	void area() {
		System.out.println("area of rectangle is : " + (length * breadth));
	}

}

class Square extends Shapes {
	Square(int side) {
		super(side);
	}

	void area() {
		System.out.println("area of square is : " + (side * side));
	}

}

class Triangle extends Shapes {
	Triangle(int length, int breadth,int height) {
		super(length, breadth, height);
	}

	void area() {
		System.out.println("area of triangle is : " + ((length * breadth * height)/2));
	}

}
public class Abstract4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes var;
		var = new Rectangle(20,10);
		var.area();

		var = new Square(15);
		//Square square = new Square(10);
		var.area();

		var= new Triangle(10,20,30);
		var.area();

	}

}
