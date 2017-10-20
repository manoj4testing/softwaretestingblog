package com.java.interviewPrograms;

import java.util.Scanner;

public class BinaryToDecimal 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a binary number");
		String binr=input.nextLine();
		System.out.println("Decimal number is:"+Integer.parseInt(binr,2));
	}
}
