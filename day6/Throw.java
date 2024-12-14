package com.day6;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		//int a=10/0;
		try
		{
			int a = 10 ;
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("It will give you infinity as answer and that is not acceptable");
		}
		
		System.out.println("After Exeception");

	}

}
