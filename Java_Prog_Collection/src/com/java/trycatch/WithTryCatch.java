package com.java.trycatch;

public class WithTryCatch {

	public static void main(String[] args) 
	{
		try
		{
			int i=9;
			int z=i/0;
			System.out.println("The Value Of I Is -" +z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
