package com.day11;

import java.util.StringJoiner;

public class StringJoinExample {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		
		joiner.add("one");
		joiner.add("two");
		joiner.add("three");
		
		String result = joiner.toString();
		System.out.println(result);
		
		joiner = new StringJoiner(",","[","]");
		
		joiner.add("one");
		joiner.add("two");
		
		result = joiner.toString();
		System.out.println(result);
		joiner.add("three");
		
		result = joiner.toString();
		System.out.println(result);
	}

}
