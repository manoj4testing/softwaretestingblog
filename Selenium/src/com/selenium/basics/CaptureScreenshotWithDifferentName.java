package com.selenium.basics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshotWithDifferentName 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	{
		CaptureScreenshotWithDifferentName obj=new CaptureScreenshotWithDifferentName();
		driver=new FirefoxDriver();
		driver.get("http://www.softwaretestingblog.in");
		Thread.sleep(3000);
		obj.getScreenShots("manoj");
		driver.close();

	}

	public void getScreenShots(String abc) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\Base_Workspace\\Luna\\Selenium\\Screenshots\\SC" + abc+getTimeStamp() + ".png")); //Files are Stored in G:\Base_Workspace\Luna\Selenium\Screenshots

	}
	public String getTimeStamp() 
	{
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return timestamp;
	}


}