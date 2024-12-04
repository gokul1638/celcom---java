package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Choice;
		String c = "";
		do {
			System.out.println("Enter the value for A:");
			int A = sc.nextInt();
			System.out.println("Enter the value for B");
			int B = sc.nextInt();

			System.out.println("1.Addition \n2.Subraction \n3.Multiplication \n4.Division \n5.Exit");
			System.out.println("Enter your choice");
			Choice = sc.nextInt();
			switch (Choice) {
			case 1:
				System.out.println("Addition : " + (A + B));
				System.out.println("Do you want to continue[yes|no]");
				c = sc.next();
				break;
			case 2:
				System.out.println("Subraction : " + (A - B));
				System.out.println("Do you want to continue[yes|no]");
				c = sc.next();
				break;
			case 3:
				System.out.println("Multiplication :" + (A * B));
				System.out.println("Do you want to continue[yes|no]");
				c = sc.next();
				break;
			case 4:
				System.out.println("Division :" + (A / B));
				System.out.println("Do you want to continue[yes|no]");
				c = sc.next();
				break;
			case 5:
				System.out.println("Exiting......");
				System.exit(0);
			}
		} while (c.equalsIgnoreCase("yes"));
		sc.close();
	}

}
