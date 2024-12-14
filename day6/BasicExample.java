package com.day6;

public class BasicExample {
			int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		int a = 10/0; 		 						//" java.lang.ArithmeticException"
		int []b={10,20,30};							//" java.lang.ArrayIndexOutOfBoundsException"
		int []c= new int[-1];						//" java.lang.NegativeArraySizeException"
		int d = Integer.parseInt("ABC");		 	//" java.lang.NumberFormatException"
		BasicExample name = null;
		System.out.println(name.a);					//" java.lang.NullPointerException"
		System.out.println("After exception");

	}

}
