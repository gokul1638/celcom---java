//12. Write a Java 8 program to sort an array and then convert the sorted array into Stream?

package com.day12;

import java.util.Arrays;

public class AdditionalPractice12 {

	public static void main(String[] args) {
		
		int arr[] = {3, 5, 2, 1, 7};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		

	}

}
