package com.java.interviewPrograms;

import java.util.Scanner;

public class PalindromeNumb 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num,rem,rev=0;
		System.out.println("Enter the number:-");
		num=in.nextInt();
		int n=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(rev==n)
			System.out.println(n+ " Number is Palindrome ");
		else
			System.out.println(n+ " Number is not a Palindrome ");
	}
}
