package com.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = number; i > 1; i--) {
			fact *= i;
		}
		System.out.println("the factorial is : " + fact);
		sc.close();
	}

}
