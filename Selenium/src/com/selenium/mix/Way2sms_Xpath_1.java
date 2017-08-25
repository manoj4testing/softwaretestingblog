package com.selenium.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2sms_Xpath_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Way2sms Xpath1
		WebDriver obj=new FirefoxDriver();
		obj.get("http://site24.way2sms.com/content/index.html");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		obj.findElement(By.name("username")).sendKeys("8457091081");
		obj.findElement(By.name("password")).sendKeys("8457091081");
		obj.findElement(By.id("loginBTN")).click();
		Thread.sleep(3000);
		//obj.findElement(By.className("button br3")).click();
		obj.findElement(By.xpath(".//*[@id='ebFrm']/div[2]/div[1]/input")).click();
		obj.manage().timeouts().implicitlyWait(90, TimeUnit.MILLISECONDS);
		//obj.findElement(By.linkText("Send SMS")).click(); this statement is not working bcoz thats a javascript code
		JavascriptExecutor js=(JavascriptExecutor)obj;
		js.executeScript("javascript:loadSMSPage('sendSMS');");
		
		//obj.findElement(By.xpath(".//*[@id='ebFrm']/div[2]/div[1]/input")).sendKeys("8457091081");
		//obj.findElement(By.xpath(".//*[@id='message']")).sendKeys("hi manoj");
		//the above two lines are not working bcoz thats inside a frame to access use switch to class
		obj.switchTo().frame("frame");
		obj.findElement(By.name("mobile")).sendKeys("8457091081");
		obj.findElement(By.name("message")).sendKeys("Hi Manoj");
		obj.findElement(By.name("Send")).click();
		obj.findElement(By.name("Send")).click();
		obj.close();
	}

}
