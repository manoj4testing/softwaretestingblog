package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.facebook.com");
		Select Bday=new Select(obj.findElement(By.name("birthday_day")));
		Bday.selectByValue("6");
		Select Bmonth=new Select(obj.findElement(By.name("birthday_month")));
		Bmonth.selectByValue("7");
		Select Byear=new Select(obj.findElement(By.name("birthday_year")));
		Byear.selectByValue("1986");
		Thread.sleep(3000);
		obj.close();
		
		

	}

}
