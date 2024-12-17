package com.day8;

import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		String s1 = "welcome to chennai";
		StringTokenizer st = new StringTokenizer(s1 , " ");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
