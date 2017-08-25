package com.toolsqa.pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Testcase 
{

	/*Launch a WebDriver
	Navigate to Url www.store.demoqa.com
	Click on My Account link
	Enter Username & Password
	Print a system message and Log out
	Close WebDriver*/
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.id("account")).click();
		driver.findElement(By.id("log")).sendKeys("xxx");
		driver.findElement(By.id("pwd")).sendKeys("7777");
		driver.findElement(By.id("login")).click();
		driver.close();		

	}

}
