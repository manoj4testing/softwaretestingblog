package com.selenium.mix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickOn_ActiveElement {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.manage().window().maximize();
		obj.switchTo().activeElement();
		WebElement l=obj.switchTo().activeElement();
		Actions a =new Actions(obj);
		a.contextClick(l).build().perform();
		//a.sendKeys(Keys.DOWN,Keys.DOWN).build().perform();
		Thread.sleep(5000);
		obj.close();
	}

}
