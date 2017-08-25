package com.selenium.TestNG;

import org.testng.annotations.Test;

public class TestNgPriorityEx 
{
	@Test(priority=0)
	public void test0()
	{
		System.out.println("Manoj0");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Manoj3");
	}
	@Test(priority=3)
	public void test3()
	{
		System.out.println("Manoj2");
	}
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Manoj1");
	}

}
