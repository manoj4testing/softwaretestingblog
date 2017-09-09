package com.java.interviewFAQ;

import java.util.Scanner;

public class InterviewFAQPractice {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=s.nextInt();
		int temp=no;
		int rev=0;
		while(no>0)
		{
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Actual No:"+temp);
		System.out.println("Reverse No"+rev);
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("No");
	}

}
