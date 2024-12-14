package com.day6;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		//int a=10/0;
		try
		{
			int a = 10 / 0;
		}
		catch(NumberFormatException e)
		{
			System.out.println("It will give you infinity as answer and that is not acceptable");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("ena da testing ah ");
		}
		catch(Exception e)
		{
			System.out.println("gokul");
		}
		System.out.println("After Exception");

	}

}
