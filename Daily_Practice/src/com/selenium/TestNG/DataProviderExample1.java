package com.selenium.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample1 {
	
	String Data;

	@Test(dataProvider="wpdata")
	public void wordpresslogin(String Uname,String PWD) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/test/wp-admin/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys(Uname);
		driver.findElement(By.id("user_pass")).sendKeys(PWD);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(3000);
		driver.close();

	}
	
	@DataProvider(name="wpdata")
	public Object[][] wordpressdata()
	{
		Object[][] Data=new Object[3][2];
		Data [0][0]="test";
		Data [0][1]="test1";
		
		Data [1][0]="test2";
		Data [1][1]="test2";
		
		Data [2][0]="test";
		Data [2][1]="test";
		
		return Data;
	}

}
