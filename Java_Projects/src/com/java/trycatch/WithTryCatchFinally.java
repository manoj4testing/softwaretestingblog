package com.java.trycatch;

public class WithTryCatchFinally {

	public static void main(String[] args) 
	{
		try
		{
			int i=8;
			int z=i/0;
			System.out.println("Executed Sucessfully"+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block Executed");
		}
		

	}

}
