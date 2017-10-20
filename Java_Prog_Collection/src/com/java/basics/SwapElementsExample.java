package com.java.basics;

public class SwapElementsExample {

	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		
		System.out.println("Before Swap Num1 is "+num1);
		System.out.println("Before Swap Num2 is "+num2);

		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swap Num1 is "+num1);
		System.out.println("After Swap Num2 is "+num2);		
	}

}
