package com.selenium.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyNAssertEx 
{
	@Test
	public void data1()
	{
		System.out.println("4");
	}
	@Test
	public void data2()
	{
		System.out.println("1");
		Assert.assertEquals("M", "k");
		System.out.println("2");
	}
	
	@Test
	public void data3()
	{
		System.out.println("3");
	}
}
