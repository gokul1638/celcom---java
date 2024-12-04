package com.day1;

public class Commandlineargument1
{
	public static void main(String [] args)
	{
		if (args.length>1)
		{

			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);

			int sum = a + b ;
			System.out.println("Addition :"+ sum);
		}
		else 
		{
			System.out.println("insufficent inputs");
		}
	}
}
