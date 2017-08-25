package com.selenium.testNG;

import org.testng.annotations.Test;

public class Testng_Enabled 
{
	@Test(enabled=true)
	public void show1()
	{
		System.out.println("Show1 Executed");
	}
	@Test(enabled=false)
	public void show2()
	{
		System.out.println("Show2 Executed");
	}
	@Test
	public void show()
	{
		System.out.println("Show Executed");
	}

}
