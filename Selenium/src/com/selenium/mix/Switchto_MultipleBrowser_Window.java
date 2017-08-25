package com.selenium.mix;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_MultipleBrowser_Window {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://site24.way2sms.com/content/index.html");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList(obj.getWindowHandles());
		obj.switchTo().window((String) al.get(1));
		obj.close();
		Thread.sleep(5000);
		//obj.close(); this statement is not working bcoz its waiting for more switch statement
		obj.switchTo().window((String) al.get(0));
		obj.close();

	}

}
