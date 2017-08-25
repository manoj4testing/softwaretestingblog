package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUsernameText {

	public static void main(String[] args)
	{
		Logger log=Logger.getLogger(GetUsernameText.class);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		log.info("Facebook Opened");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//driver.findElement(By.name("firstname")).sendKeys("abc@gmail.com");
		String st=driver.findElement(By.name("firstname")).getAttribute("aria-label");
		System.out.println(st);

	}

}
