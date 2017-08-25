package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyClasProg1
{
	public static void main(String[] args)throws Exception
	{
		FirefoxDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://www.google.co.in/");
		WebElement we=obj.findElement(By.id("lst-ib"));
		we.sendKeys("Selenium");
		Thread.sleep(2000);
		we.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);
		
		/*we.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		we.sendKeys(Keys.DELETE);
		we.sendKeys("qtp");
		we.sendKeys(Keys.ENTER);*/
		
		obj.close();
		obj.quit();
		
	}
}
