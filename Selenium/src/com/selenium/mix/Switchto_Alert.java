package com.selenium.mix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://site24.way2sms.com/content/index.html");
		obj.switchTo().alert().dismiss();
		Thread.sleep(5000);
		obj.close();
		

	}

}
