package com.day3;

class Shapes {
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

	void area() {
		System.out.println("cannot find area");
	}

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
public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(10, 20);
		Square square = new Square(10);
		Triangle triangle = new Triangle(10,20,30);
		rectangle.area();
		square.area();
		triangle.area();

	}

}
