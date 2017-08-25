package com.selenium.mix;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_Travels_Web {

	public static void main(String[] args) 
	{
		WebDriver obj=new FirefoxDriver();
		obj.get("http://newtours.demoaut.com/");
		obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.manage().window().maximize();
		obj.findElement(By.name("userName")).sendKeys("testingpro");
		obj.findElement(By.name("password")).sendKeys("testingpro");
		obj.findElement(By.name("login")).click();
		//obj.findElement(By.name("tripType")).click(); due to same multiple name it doesnt work go for list bcoz its a radio button group
		List <WebElement> l1=obj.findElements(By.name("tripType"));
		l1.get(1).click();
		Select s1=new Select(obj.findElement(By.name("passCount")));
		s1.selectByValue("2");
		Select s2=new Select(obj.findElement(By.name("fromPort")));
		s2.selectByVisibleText("Frankfurt");
		Select s3=new Select(obj.findElement(By.name("airline")));
		s3.selectByVisibleText("Unified Airlines");
		obj.findElement(By.name("findFlights")).click();
		obj.findElement(By.linkText("SIGN-OFF")).click();
	}

}
