//1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 11, 44);
		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

	}

}
