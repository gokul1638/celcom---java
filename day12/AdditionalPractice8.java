//8. Given a list of integers, sort all the values present in it using Stream functions?

package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> sortList1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortList1);

	}

}
