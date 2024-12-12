package com.day4;

public class ConstructorOverloading {
	
	int a,b,c;
	
	ConstructorOverloading (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	ConstructorOverloading(int a, int b , int c)
	{
		this(a , b);
		this.c=c;
		
	}
	void display()
	{
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(10,20);
		obj.display();
	}

}
