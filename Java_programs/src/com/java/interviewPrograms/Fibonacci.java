package com.java.interviewPrograms;
import java.util.Scanner;

public class Fibonacci 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num,n1,n2=0,n3=1;
		num=in.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(" "+n3+" ");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
