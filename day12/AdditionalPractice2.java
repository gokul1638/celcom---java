//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		
		List<Integer> oneList = list.stream()
				.filter(x ->String.valueOf(x)
				.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(oneList);

	}

}
