package com.java.interviewFAQ;

import java.util.Scanner;

public class SumNumericValueInString {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String c=sc.next();
		String digits = "";
		int sum=0;
		for(int i=0;i<c.length();i++)
		{
			char ch = c.charAt(i);
			if (Character.isDigit(ch))
			{
				digits = digits+ch;						
			}		
			
		}
		System.out.println(digits);
		int no1=Integer.parseInt(digits),rem=0;
		while(no1>0)
		{
		rem=no1%10;
		sum=sum+rem;
		no1=no1/10;
		}
		System.out.println(sum);
	}

}
