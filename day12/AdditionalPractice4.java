//4. Given the list of integers, find the first element of the list using Stream functions?

package com.day12;

import java.util.Arrays;
import java.util.List;

public class AdditionalPractice4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		int firstElement = list.stream().findFirst().get();
		System.out.println(firstElement);

	}

}
