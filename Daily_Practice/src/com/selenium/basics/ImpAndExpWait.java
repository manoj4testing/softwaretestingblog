package com.selenium.basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpAndExpWait
{
	public static void main(String[] args)
	{
		FirefoxDriver obj1=new FirefoxDriver();
		
		//Implicit wait Commands 
		obj1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Wait For Page
		obj1.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		//Wait For Script 
		obj1.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		
		//Explicit Commands 
		WebDriverWait wait=new WebDriverWait(obj1, 60);
		//Wait for alert
		wait.until(ExpectedConditions.alertIsPresent());
		//Wait for title
		wait.until(ExpectedConditions.titleIs("title"));
		//Wait for Partial Title
		wait.until(ExpectedConditions.titleContains("title"));
		//Wait for Element Present
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("")));
		//Wait for Test
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""), "text"));
		//wait until element became enabled/Clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		//Wait for Frame 
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("")));
		
	}
}
