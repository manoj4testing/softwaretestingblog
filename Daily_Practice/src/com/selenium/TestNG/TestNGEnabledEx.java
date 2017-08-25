package com.selenium.TestNG;

import org.testng.annotations.Test;

public class TestNGEnabledEx 
{
	@Test
	public void one()
	{
		System.out.println("In One Method");
	}
	@Test(enabled=true)
	public void two()
	{
		System.out.println("I Am In Enabled True");
	}
	@Test(enabled=false)
	public void three()
	{
		System.out.println("enabled False");
	}

}
