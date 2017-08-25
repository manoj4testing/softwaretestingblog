package com.selenium.mix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//LAUNCH WEBSITE AND SEND A SMS
		WebDriver obj=new FirefoxDriver();
		// Launch Way2sms Website
		obj.get("http://site21.way2sms.com/content/index.html");
		obj.manage().window().maximize();
		// Implicitly Wait Upto 50 Seconds means if site is ready with in 50 second then no need to wait
		obj.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		obj.findElement(By.name("username")).sendKeys("8457091081");
		obj.findElement(By.name("password")).sendKeys("8457091081");
		obj.findElement(By.id("loginBTN")).click();
		obj.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		obj.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[1]/input")).click();
		obj.findElement(By.xpath("/html/body/div[7]/div[1]/ul/li[6]/a")).click();
		obj.switchTo().frame("frame");
		//Add To Contact
		obj.findElement(By.name("contactName")).sendKeys("Manoj");
		obj.findElement(By.name("mobileNumber")).sendKeys("9063426783");
		//JavascriptExecutor js=(JavascriptExecutor) obj;
		//js.executeScript("javascript:groupOption('addGroup');");
		obj.findElement(By.xpath("/html/body/form/div[1]/div/div[4]/div[2]/div/div[2]/input")).click();
		Thread.sleep(5000);
		obj.switchTo().parentFrame();
		obj.findElement(By.xpath("/html/body/div[7]/div[1]/ul/li[6]/a")).click();
		obj.switchTo().frame("frame");
		JavascriptExecutor js=(JavascriptExecutor) obj;
		js.executeScript("javascript:checkAll('all');");
		js.executeScript("deleteContact();");
		obj.findElement(By.name("dtnad")).click();

	}

}
