package com.selenium.basics;

public class PrintExceptionMsg3 {

	public static void main(String[] args) 
	{
		try 
		{
            @SuppressWarnings("unused")
			int x=1/0;
          
        } 
		catch (Exception e) 
		{
            System.out.println(e.getMessage());
        }

	}

}
