package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("Email")).sendKeys("pradhan.monoj@gmail.com");
		String value=driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println(value);
	}
}
