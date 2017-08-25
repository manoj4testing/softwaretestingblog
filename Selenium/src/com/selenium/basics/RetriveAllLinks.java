package com.selenium.basics;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetriveAllLinks 
{
	@org.testng.annotations.Test
	public void importlink() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Thread.sleep(3000);
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(int i=1;i<li.size();i++)
		{
			//String t1=li.get(i).getText();
			String t2=li.get(i).getAttribute("href");
			System.out.println(t2);
			
		}	
		
	}
}
