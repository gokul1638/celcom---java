package com.day8;

import java.util.Date;
public class Javautil {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		
		System.out.println(date.getDate());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		System.out.println(date.getHours()-12);
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getDay());
	}

}
