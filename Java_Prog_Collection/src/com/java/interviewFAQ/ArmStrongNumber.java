package com.java.interviewFAQ;

import java.util.Scanner;

public class ArmStrongNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a,c=0,num,temp;
		num=in.nextInt();
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println(temp+ " Armstrong number");   
	    else  
	        System.out.println(temp+" Not Armstrong number"); 
	}  

}
