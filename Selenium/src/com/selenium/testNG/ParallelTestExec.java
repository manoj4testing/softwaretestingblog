package com.selenium.testNG;

import org.testng.annotations.Test;

public class ParallelTestExec 
{
	@Test
	public void test1()
	{
		System.out.println("Test1 Executed");
		System.out.println("Test Case One with Thread Id:- "+ Thread.currentThread().getId());
	}
	@Test
	public void test2()
	{
		System.out.println("Test2 Executed");
		System.out.println("Test Case Two with Thread Id:- "+ Thread.currentThread().getId());
	}

}
