package com.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		int number = sc.nextInt();
		System.out.println("number\tvalue");
		for (int i = 1; i <= number; i++) {
			int fact = 1;
			for (int j = i; j >= 1; j--) {
				fact *= j;
			}
			System.out.println(i+"\t" + fact);
		}
		
		sc.close();
	}

}
