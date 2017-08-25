package com.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ex2FindNoOfElements 
{
	public static void main(String[] args)throws Exception
	{
		FirefoxDriver obj1=new FirefoxDriver();
		obj1.get("https://www.google.co.in/");
		Thread.sleep(2000);
		obj1.manage().window().maximize();
		List<WebElement> elem=obj1.findElements(By.tagName("a"));
		
		int count=elem.size();
		System.out.println("Number Of link=" + count);
		for(int i=0;i<=count;i++)
		{
			System.out.println(elem.get(i).getText());
		}
		
		
	}
	
	
}
