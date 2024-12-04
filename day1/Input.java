package com.day1;

import java.util.Scanner;

public class Input
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your customer id: ");
		int id=sc.nextInt();
		System.out.println("Enter your customer name: ");
		String name=sc.next();
		System.out.println("Enter your customer Salary: ");
		float salary=sc.nextFloat();

		System.out.println("customer id : "+id);
		System.out.println("customer name : "+name);
		System.out.println("customer Salary : "+salary);
		
		sc.close();
	}
}