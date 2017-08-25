package com.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SamsungPhonePriceDetails 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("samsung j7");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		String xp="//div[.='SAMSUNG Galaxy J7 (Black, 16 GB)']/../../div[2]//div[1]";
		String price = driver.findElement(By.xpath(xp)).getText();
		System.out.println(price);

	}
}
