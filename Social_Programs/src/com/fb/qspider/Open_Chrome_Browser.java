package com.fb.qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Open_Chrome_Browser 
{
	/*public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Git_Prgms\\softwaretestingblog\\Social_Programs\\src\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		//Thread.sleep(7000);
	}*/
	
	@Test
	public void open_chrome() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Git_Prgms\\softwaretestingblog\\Social_Programs\\src\\library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(7000);
		driver.close();
	}
	

}
