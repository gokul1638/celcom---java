package com.day6;


class AgeException extends Exception
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "invalid age";
	}
}
public class UserdefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		if (age >= 18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			try
			{
				throw new AgeException();
			}
			catch (AgeException e)
			{
				System.out.println(e);
			}
			
		}

	}

}
