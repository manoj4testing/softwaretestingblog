package com.selenium.testNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups="cat1")
public class Demo 
{
	@BeforeGroups(groups="cat1")
	public void dostuff()
	{
		System.out.println("I Represent From 1");
	}
	@BeforeMethod
	public void setup()
	{
		System.out.println("i am setup method");
	}
	
	@Test(groups="cat2")
	public void test1()
	{
		System.out.println("First Test");
		String name="tom";
		org.testng.Assert.assertEquals(name.length(), 3);
	}
	@Test
	public void test2()
	{
		System.out.println("2nd Test");
		org.testng.Assert.assertFalse(2>1);
	}
	@AfterMethod
	public void teardown()
	{
		System.out.println("IAm in Tear Down");
	}
}