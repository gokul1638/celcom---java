//9. Given a list of integers, sort all the values present in it in descending order using Stream functions?
package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice9 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> ascSort = list.stream().sorted((x,y) -> y - x).collect(Collectors.toList());
		System.out.println(ascSort);

	}

}
