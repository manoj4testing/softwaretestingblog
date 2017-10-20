package com.java.trycatch;

public class WithTryFinally {

	public static void main(String[] args) 
	{
		try
		{
			int i=9;
			int z=i/0;
			System.out.println("Executed Sucessfully"+ z);
		}
		finally
		{
			System.out.println("Exception Comes");
		}

	}

}
