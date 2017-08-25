package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmenu_KeywordMouse_Automation {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.manage().window().maximize();
		obj.switchTo().activeElement();
		WebElement l=obj.findElement(By.linkText("Gmail"));
		Actions a=new Actions(obj);
		//a.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).build().perform();
		a.contextClick(l).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		Thread.sleep(5000);
		//obj.quit();
		obj.close();

	}

}
