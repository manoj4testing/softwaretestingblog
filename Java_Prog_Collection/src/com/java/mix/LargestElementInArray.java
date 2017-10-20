package com.java.mix;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) 
	{
		int large, size, i;
		int arr[] = new int[50];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Array Size : ");
		size = scan.nextInt();

		System.out.print("Enter Array Elements : ");
		for(i=0; i<size; i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.print("Searching for the Largest Number....\n\n");

		large = arr[0];

		for(i=0; i<size; i++)
		{
			if(large < arr[i])
			{
				large = arr[i];
			}

		}

		System.out.print("Largest Number = " +large); 

	}

}
