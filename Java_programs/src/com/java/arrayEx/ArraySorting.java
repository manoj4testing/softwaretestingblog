package com.java.arrayEx;

public class ArraySorting {
	public static void sortArray(int a[]){
		int temp;
		for (int i = 0; i < a.length; i++) 
		{	
			for (int j = 1; j < a.length; j++) 
			{
				if (a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static int searchMaxElement(int a[]){
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				
			}
		}
		return max;
	}
	public static int searchMinElement(int a[]){
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int a[] = {6,5,7,4,9};
		sortArray(a);
		System.out.println("Maximum Element: "+searchMaxElement(a));
		System.out.println("Minimum Element: "+searchMinElement(a));
	}
}