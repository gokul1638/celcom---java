package com.day13;

public class Factorial {
	
	public int getFactorial(int c)
	{
		int fact = 1;
		for (int i = 1 ; i <= c ; i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
