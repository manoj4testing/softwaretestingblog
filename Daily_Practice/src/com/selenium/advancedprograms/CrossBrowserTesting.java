package com.selenium.advancedprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Testing_Utilities\\BrowsersDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.softwaretestingblog.in/");

	}

}
