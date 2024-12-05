package com.day2;

public class Arrayofarray {

	public static void main(String[] args) {
		int arr[][] = {{10,20},{20,30,40},{40,50,60,70}};
		
		for (int i[] : arr)
		{
			for(int j : i)
			{
				System.out.print( j + " ");
			}
			System.out.println();
		}

	}

}
