package com.selenium.TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class Demo3
	{
		
		@Test
		public void  Show3()
		{
			System.out.println("Inside 3");
		}
		/*@BeforeClass
		public void  Show4()
		{
			System.out.println("Inside 4");
		}*/
		@BeforeTest
		public void  Show5()
		{
			System.out.println("Inside 5");
		}
		/*@BeforeSuite
		public void  Show6()
		{
			System.out.println("Inside 6");
		}*/

	}


