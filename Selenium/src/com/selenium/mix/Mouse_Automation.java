package com.selenium.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Automation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.flipkart.com");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		WebElement e = obj.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]/a")); 
		int x =e.getLocation().getX();
		int y= e.getLocation().getY();
		Actions a =new Actions(obj);
		a.moveByOffset(x,y).build().perform();

	}

}
