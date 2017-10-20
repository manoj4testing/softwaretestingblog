package com.java.interviewPrograms;
import java.util.Scanner;
public class SumOfDigits 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int sum=0,n,a;
		n=in.nextInt();
		while(n>0)
		{
			a=n%10;
			n=n/10;
			sum=sum+a;
		}
		System.out.println("Sum of digits=" +sum);
	}
}
