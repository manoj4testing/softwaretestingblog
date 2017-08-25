package com.selenium.exception;

public class PrintException3 {

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
