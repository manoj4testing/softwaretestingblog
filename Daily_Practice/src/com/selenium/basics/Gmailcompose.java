package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailcompose 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("manojkuranaa@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("swarnaprabha@0733");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id=':j7']/div/div")).click();

	}

}
