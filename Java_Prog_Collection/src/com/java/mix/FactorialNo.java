package com.java.mix;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) 
	{
		int num, i, fact=1;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
		
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
		
        System.out.print("Factorial of " + num + " is " + fact);

	}

}
