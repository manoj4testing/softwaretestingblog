package com.java.interviewFAQ;

import java.util.Scanner;

public class ExtractNumberFromString {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String c=sc.next();
		String digits = "";
		int no=34;
		int sum=0;
		for(int i=0;i<c.length();i++)
		{
			char ch = c.charAt(i);
			if (Character.isDigit(ch))
			{
				digits = digits+ch;				
				sum=no+Integer.parseInt(digits);				
			}		
			
		}
		System.out.println(sum);
		//System.out.println(digits);

	}

}
