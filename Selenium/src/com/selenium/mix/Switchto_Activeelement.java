package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_Activeelement {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.switchTo().activeElement().sendKeys("stateresults");
		obj.findElement(By.name("btnG")).click();
		Thread.sleep(3000);
		obj.close();

	}

}
