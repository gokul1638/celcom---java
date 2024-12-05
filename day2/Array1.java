package com.day2;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0;
		System.out.println("initial elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " \n");
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum+=arr[i];
		}
		System.out.println("\nSum of all the array elements is : " + sum);
		sc.close();
	}

}
