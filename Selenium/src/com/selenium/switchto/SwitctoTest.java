package com.selenium.switchto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitctoTest {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//String Parent=driver.getWindowHandle();
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Set<String> Handle=driver.getWindowHandles();
		System.out.println(Handle.size());

	}

}
