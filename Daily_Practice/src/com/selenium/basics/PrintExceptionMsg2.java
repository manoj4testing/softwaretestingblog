package com.selenium.basics;

public class PrintExceptionMsg2 {

	public static void main(String[] args) 
	{
		try 
		{
			int a[]= new int[1];
			a[1]=12;

		} 
		catch (Exception e) 
		{
			e.printStackTrace();

		}

	}

}
