package com.day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalPractice13 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Grape");
		List<String> upperList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);

	}

}
