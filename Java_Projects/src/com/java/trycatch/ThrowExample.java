package com.java.trycatch;

public class ThrowExample {

	public static void main(String[] args)
	{
		try
		{
			int i=9;
			@SuppressWarnings("unused")
			int z=i/0;
			//throw new Exception();
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)//Subclass Always in Top
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmatic Exception ");
		}
		catch(Exception e) // Super Class Always Down
		{
			System.out.println(e.getMessage());
			System.out.println("Arithmatic Exception ");
		}
		

	}

}
