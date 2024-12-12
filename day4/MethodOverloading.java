package com.day4;

public class MethodOverloading {
double area(int length , int breadth)
{
	int area = length * breadth ;
	return area;
}

double area(int length , int breadth , int height)
{
	int area = length * breadth * height ;
	return area;
}

public static void main(String [] gokul)
{
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
	MethodOverloading obj = new MethodOverloading();
	
	//System.out.print("Enter your choice :");
	
	boolean a= true;
	while(a)
	{
		System.out.println("1.area of rectangle\n2.area of triangle\n3.exit");
		System.out.print("Enter your choice :");
		int choice = sc.nextInt();
		
		
	switch(choice)
	{
		case 1:
		{
			System.out.println("length of the rectangle :");
			int length = sc .nextInt ();
			System.out.println("breadth of the rectangle :");
			int breadth = sc .nextInt ();
			System.out.println(obj.area(length,breadth));
			break;
		}
		case 2:
		{
			System.out.println("length of the triangle :");
			int length = sc .nextInt ();
			System.out.println("breadth of the triangle :");
			int breadth = sc .nextInt ();
			System.out.println("height of the triangle :");
			int height = sc .nextInt ();
			System.out.println(obj.area(length,breadth,height));
			break;
		}
		case 3:
		{
			
			a=false;
			break;
		}
		default :
		{
			System.out.println("invalid input");
		}
	}
	}
}
}
