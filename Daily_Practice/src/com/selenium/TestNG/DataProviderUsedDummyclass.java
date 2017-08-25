package com.selenium.TestNG;

import org.testng.annotations.Test;

public class DataProviderUsedDummyclass 
{
	@Test(dataProviderClass=com.selenium.TestNG.DataProviderDummyclass.class,dataProvider="senddata")
	public void display(String Name)
	{
		try 
		{
			System.out.println(Name);
			System.out.println("-------");
		} 
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		}
	}
	

}
