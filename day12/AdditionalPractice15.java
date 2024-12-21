//15. flatMap

package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice15 {

	public static void main(String[] args) {
		List<Integer> even = Arrays.asList(2, 4, 6, 8);
		List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
		
		List<List<Integer>> evenOdd = Arrays.asList(even, odd);
		
		System.out.println("Before Flattering");
		System.out.println(evenOdd);
		
		List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println("After Flattering");
		System.out.println(result);

	}

}
