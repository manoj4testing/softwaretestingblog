package com.Gmaillogin.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Base_Workspace\\Luna\\GmailLoginProj\\src\\com\\Gmaillogin\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
