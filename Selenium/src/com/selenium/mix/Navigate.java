package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("C:\\Users\\my\\Desktop\\test.html");
		Thread.sleep(5000);
		System.out.println("Refresh Started");
		driver.navigate().refresh();
		System.out.println("Refresh done");
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
	}

}
