package com.selenium.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting
{
	WebDriver driver=null;
	@Parameters("Browsername")
	@Test
	public void open(String name)
	{
		if(name.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			driver.close();
		}
		else if(name.toLowerCase().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Testing_Utilities\\BrowsersDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
			driver.close();
		}
		else if(name.equalsIgnoreCase("ie"))
		{
			System.setProperty("wwebdriver.ie.driver", "G:\\Testing_Utilities\\BrowsersDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("http://www.google.com");
			driver.close();
		}
	}
	

}
