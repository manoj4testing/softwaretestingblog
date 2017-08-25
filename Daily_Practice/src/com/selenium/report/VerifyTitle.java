package com.selenium.report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyTitle 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;

	@Test
	public void verifytitle()
	{
		report=new ExtentReports("G:\\Base_Workspace\\Neon\\Daily_Practice\\Report\\report.html");
		logger=report.startTest("VerifyBlogTitle");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Application Up And running");
		try
		{
		Assert.assertTrue(driver.getTitle().contains("xxxxx"));
		logger.log(LogStatus.PASS, "Virify Title Sucessfully");
		}
		catch(Exception e)
		{
			System.out.println("Title Not Matched");
			logger.log(LogStatus.FAIL, "Title Verification Failed");
			driver.get("G:\\Base_Workspace\\Neon\\Daily_Practice\\Report\\report.html");
		}
		//driver.close();
		logger.log(LogStatus.INFO, "Execution Completed");
		report.endTest(logger);
		report.flush();
		driver.get("G:\\Base_Workspace\\Neon\\Daily_Practice\\Report\\report.html");
	}

}
