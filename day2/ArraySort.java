package com.day2;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 75, 22, 49 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
