//5. Given a list of integers, find the total number of elements present in the list using Stream functions?
package com.day12;

import java.util.Arrays;
import java.util.List;

public class AdditionalPractice5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		long count = list.stream().count();
		System.out.println(count);

	}

}
