package com.selenium.qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Chrome_Browser 
{
	static
	{
	//set the path of driver executable
	String value=("D:\\Git_Prgms\\softwaretestingblog\\Latest_Env_Jars\\Drivers\\chromedriver_2.33.exe");
	System.setProperty("webdriver.chrome.driver", value);
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	}

}
