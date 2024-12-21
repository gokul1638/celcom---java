//10. Given an integer array nums, return true if any value appears at least twice in the array,and return false if every element is distinct.

package com.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdditionalPractice10 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 10, 11, 12, 13, 14, 15, 22, 31, 13, 11, 44);
		List<Integer> duplicateList = list.stream()
				.filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toList());
				//System.out.println(duplicateList);

		Set<Integer> duplicateSet = list.stream()
				.filter(x -> list.indexOf(x) != list.lastIndexOf(x))
				.collect(Collectors.toSet());
				//System.out.println(duplicateSet);

		Set<Integer> tempSet = new HashSet<>();
				long duplicateCount = list.stream()
						.filter(x -> tempSet.add(x) == false)
						.count();
				//System.out.println(duplicateCount);
		
		tempSet.clear();
		boolean flag = list.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false ;
		System.out.println(flag);

	}

}
