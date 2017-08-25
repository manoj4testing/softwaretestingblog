package com.selenium.TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGResrunFailedTestcases3 
{
	
	@Test
	public void test3()
	{
		Assert.assertTrue(false);
		System.out.println("Login Into indjobupdate");
	}

}
