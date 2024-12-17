package com.day8;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Celcom";
		 
		System.out.println(s1.length());
		System.out.println(s1.concat(" Solutions"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.equals("Solutions"));
		System.out.println(s1.equalsIgnoreCase("solutions"));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('c'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.startsWith("cel"));
		System.out.println(s1.endsWith("com"));
		System.out.println(s1.replace('c','w'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = "Celcom Solutions Pvt Ltd";
		System.out.println(s2.substring(3,9));
		System.out.println(s2.substring(3));

	}

}
