package com.day2;

import java.util.Scanner;

public class Arrayoddeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, oddcount = 0, evencount = 0;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("odd number =" + oddcount);
		System.out.println("even number =" + evencount);
		sc.close();

	}

}
