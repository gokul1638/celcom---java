package com.day2;

import java.util.Scanner;

public class DuplicateCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, duplicateCount=0;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		for (int i=0 ; i<arr.length ;i++)
		{
			int count=0;
			for (int j=i+1; j<arr.length ;j++)
			{
					if(arr[i] == arr[j] && arr[i]>0)
					{
						count++;
						arr[j]=0;
						
						
					}
				
			}
			if(count>0)
			{
				duplicateCount+=1;
			}
		}
		System.out.println(duplicateCount);
		sc.close();

	}

}
