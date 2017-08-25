package com.selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='menu1']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='dropdown-menu']/li/a"));
		for(int i=0;i<li.size();i++)
		{
			Object o=li.get(i); 
			if(li.get(i).equals(o))
			{
				li.get(i).click();
			}
		}

	}

}
