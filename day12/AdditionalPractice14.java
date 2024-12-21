//14. Convert a List of String into a Map key and it's length as Map Value using Java 8 Stream
package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdditionalPractice14 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");		
		Map<String, Integer> map = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println(map);
		

	}

}
