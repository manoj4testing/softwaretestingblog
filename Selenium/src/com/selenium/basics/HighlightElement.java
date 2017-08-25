package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightElement {

	public static void Highlight_Element(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{ 
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement el=driver.findElement(By.xpath(".//*[@id='email']"));
		Highlight_Element(driver, el);
		Thread.sleep(5000);
		driver.close();
	}

}
