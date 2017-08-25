package com.selenium.basics;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLog {

	public static void main(String[] args) 
	{
		Logger log=Logger.getLogger(CreateLog.class);		
		WebDriver driver=new FirefoxDriver();
		log.info("WebDriver Object Created");
		driver.get("http://www.google.com");
		log.info("Google Site Opened");
	}
}
