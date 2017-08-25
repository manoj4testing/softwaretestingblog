package com.selenium.mix;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int n=links.size();
		System.out.println(n);
		for(WebElement ele:links)
		{
			System.out.println(ele.getAttribute("href"));
		}
		
	}

}
