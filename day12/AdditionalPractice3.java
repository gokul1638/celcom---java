package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdditionalPractice3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		List<Integer> duplicateList = list.stream()
				.filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toList());
				System.out.println(duplicateList);

				Set<Integer> duplicateSet = list.stream()
				.filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toSet());
				System.out.println(duplicateSet);

				Set<Integer> tempSet = new HashSet<>();
				long duplicateCount = list.stream()
						.filter(x -> tempSet.add(x) == false)
						.count();
				System.out.println(duplicateCount);

	}

}
