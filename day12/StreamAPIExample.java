package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(20, 10, 70, 45, 53);

		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		long count = numbers.stream().filter(x -> x % 2 == 0).count();
		System.out.println(count);

		List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		List<Integer> even3 = numbers.stream().filter(x -> x % 2 == 0).sorted().map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(even3);
	}

}