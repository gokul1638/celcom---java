package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getYear());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getMinute());
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getSecond());

	}

}
