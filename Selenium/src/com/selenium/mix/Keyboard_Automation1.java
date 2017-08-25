package com.selenium.mix;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Automation1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Keyboard Automation on Google Searchbox
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.manage().window().maximize();
		Thread.sleep(1000);
		//obj.switchTo().activeElement().sendKeys("hi");
		//Thread.sleep(5000);
		//Keyboard Automation Starts From here
		Actions a= new Actions(obj);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		obj.switchTo().activeElement().sendKeys("Indjobupdate.in");
		//obj.close();
		//a.sendKeys(Keys.chord(Keys.ALT,Keys.F4)).build().perform(); (NOT Working Findout)

	}

}
