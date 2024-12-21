//11. Java 8 program to find factorial of given list of integer values

package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice11 {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> factList = list1.stream().map(x -> {
		int fact = 1;
		for(int i=1; i<=x;i++)

		fact = fact * i;
		return fact;
		}).collect(Collectors.toList());

		System.out.println(factList);
		

	}

}
