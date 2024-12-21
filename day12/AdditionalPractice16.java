package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AdditionalPractice16 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		Consumer<String> consumer = str -> System.out.println(str);
		strList.forEach(consumer);

		Consumer<Integer> evenConsumer = n -> {

		if(n % 2 == 0)
		System.out.println(n);
		};
		list.forEach(evenConsumer);

	}

}
