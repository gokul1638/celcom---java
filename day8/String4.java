package com.day8;

public class String4 {

	public static void main(String[] args) {
		String s1 = new String ("gokul");
		String s2 = new String ("gokul");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s3 == s4);
		
		s4=s4.toUpperCase();
		System.out.println(s3 == s4.toLowerCase());

	}

}
