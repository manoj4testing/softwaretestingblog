package com.selenium.basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShort {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		try
		{
			driver.get("https://www.google.co.in/");
			WebElement we=driver.findElement(By.id("lst"));
			we.sendKeys("Selenium");
			//driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("Selenium");
		}
		catch (Exception e)
		{
			File scrf=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrf, new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\ScreenShot\\test.png"));
		}
		driver.close();
	}

}
