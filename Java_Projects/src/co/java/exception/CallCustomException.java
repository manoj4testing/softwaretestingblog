package co.java.exception;

import java.util.Scanner;

public class CallCustomException
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = s.nextInt();
		try
		{
			if(age < 18)
			{
				throw new MyException();
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getFaultMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
	
}
