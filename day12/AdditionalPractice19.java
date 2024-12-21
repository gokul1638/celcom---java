package com.day12;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AdditionalPractice19 {

	public static void main(String[] args) {
		Supplier<String[]> supplier = () -> new String[] {"One", "Two", "Three"};
		Arrays.asList(supplier.get()).forEach(System.out::println);

		Predicate<String> myPredicate = str -> str.contains("o") || str.contains("O");
		Function<String, Character> myFunction = str -> str.charAt(0);
		Consumer<Character> myConsumer = c -> System.out.println(c);

		Arrays.asList(supplier.get()).stream().filter(myPredicate).map(myFunction).forEach(myConsumer);

	}

}
