package com.selenium.mix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class deletecookies {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver= new FirefoxDriver();
		String URL="http://www.flipcart.com";
		driver.navigate().to(URL);
		driver.manage().deleteAllCookies();
		System.out.println("Cookies Deleted");

	}

}
