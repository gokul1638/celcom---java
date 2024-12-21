package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AdditionalPractice17 {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		Predicate<String> predicate = str -> str.contains("p");
		strList.stream().filter(predicate).forEach(System.out::println);

		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		list.stream().filter(evenPredicate).forEach(System.out::println);

	}

}
