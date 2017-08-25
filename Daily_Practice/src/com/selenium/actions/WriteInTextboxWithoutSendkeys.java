package com.selenium.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;

public class WriteInTextboxWithoutSendkeys {

	public static void setAttribute(WebElement element, String attributeName,
			String value)
	{
		WrapsDriver wd = (WrapsDriver) element;
		JavascriptExecutor driver = (JavascriptExecutor)wd.getWrappedDriver();
		driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",
				element, attributeName, value);
	}


	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement input_user=driver.findElement(By.xpath("//*[@id='email']"));
		setAttribute(input_user,"value","Deepthi");
	}

}
