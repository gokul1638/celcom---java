package com.day8;

public class String3 {

	public static void main(String[] args) {
		String s1 = "celcom Solutions";
		
		char[] ch = s1.toCharArray();
		
		for(char c : ch)
		{
			System.out.println(c);
		}
		
		for ( int i = 0 ; i < s1.length() ; i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		String s2 = "Hi this is Gokul";
		
		String [] t = s2.split(" ");
		
		for (String s : t)
		{
			System.out.println(s);
		}

	}

}
