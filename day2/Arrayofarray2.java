package com.day2;

public class Arrayofarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {3,4,5,6};
		arr[2] = new int[] {7,8,9 };
		
		for (int i[] : arr)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
