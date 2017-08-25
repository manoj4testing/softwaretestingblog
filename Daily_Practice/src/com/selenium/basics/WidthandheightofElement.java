package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WidthandheightofElement
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement we=driver.findElement(By.name("btnK"));
		int width=we.getSize().getWidth();
		int hig=we.getSize().getHeight();
		System.out.println("Width="+width);
		System.out.println("Height="+hig);
		driver.close();
		
	}
}
