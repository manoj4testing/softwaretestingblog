package com.selenium.testNG;

import org.testng.annotations.Test;

public class Testng_DependsonMethod 
{
	@Test
	public void show1()
	{
		System.out.println("Show1 Executed");
	}
	@Test(dependsOnMethods = {"show1"})
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
