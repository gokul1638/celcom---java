package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AdditionalPractice18 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		Function<String, Character> function = str -> str.charAt(0);
		strList.stream().map(function).forEach(System.out::println);

		Function<Integer, String> function1 = n -> {
			if (n % 2 == 0)
				return "Even";
			else

				return "Odd";
		};
		list.stream().map(function1).forEach(System.out::println);

	}

}
