package com.selenium.basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("http://toolsqa.wpengine.com/automation-practice-form/");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement e=obj.findElement(By.name("continents"));
		Select sel=new Select(e);
		sel.selectByIndex(5);	
	}
}
