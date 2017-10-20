package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Year");
		int year=Integer.parseInt(br.readLine());

		//Century year divisible by 400
		if(year%100==0 && year%400==0)
			System.out.println("it is leap year");
		else if(year%100!=0 && year%4==0)
			System.out.println("it is leap year");
		else
			System.out.println("it is not leap year");

	}

}
