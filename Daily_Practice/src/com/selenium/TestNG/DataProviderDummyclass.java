package com.selenium.TestNG;

import org.testng.annotations.DataProvider;

public class DataProviderDummyclass 
{
	@DataProvider(name="senddata")
	public String send()
	{
		String name="Manoj Kumar Rana";
		return name;
	}

}
