//6. Given a list of integers, find the maximum value element present in it using Stream functions?

package com.day12;

import java.util.Arrays;
import java.util.List;

public class AdditionalPractice6 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		int max = list.stream().max((x,y) -> x - y).get();
		System.out.println(max);

	}

}
