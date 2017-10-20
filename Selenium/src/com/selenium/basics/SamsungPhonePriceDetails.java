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
		String xp=".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/div/a[3]/div/div[1]";
		String price = driver.findElement(By.xpath(xp)).getText();
		System.out.println(price);
		driver.close();

	}
}
