package com.java.mix;

import java.util.Scanner;

public class SmallestElementInArray {

	public static void main(String[] args) 
	{
		int small, size, i;
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

		System.out.print("Searching for the Smallest Element....\n\n");

		small = arr[0];

		for(i=0; i<size; i++)
		{
			if(small > arr[i])
			{
				small = arr[i];
			}

		}

		System.out.print("Smallest Element = " + small); 

	}

}
