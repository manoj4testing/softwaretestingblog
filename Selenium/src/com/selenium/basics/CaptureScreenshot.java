package com.selenium.basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	@org.testng.annotations.Test
	public static void capture(WebDriver driver)
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/pic1.png"));
			System.out.println("First");
		} 
		catch (Exception e) 
		{
			System.out.println("The Error Msg:" + e.getMessage());
		}
	}
	@org.testng.annotations.Test
	public static void capturewithDfferentName(WebDriver driver,String Name)
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshot/"+Name+".png"));
			System.out.println("Second");
		} 
		catch (Exception e) 
		{
			System.out.println("The Error Msg:" + e.getMessage());
		}
	}

}
