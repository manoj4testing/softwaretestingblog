package com.selenium.TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest
{
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login");
	}
	@Test(priority=2)
	public void search()
	{
		System.out.println("Search");
		Assert.assertEquals("Manoj", "Monoj");
	}
	@Test(priority=3)
	public void advsearch()
	{
		System.out.println("Adv Search");
	}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("Logout");
	}

}
