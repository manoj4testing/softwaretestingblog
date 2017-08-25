package com.selenium.HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class test implements ITestListener
{
	WebDriver driver;
	@Test
	public void tc1()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void tc2()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Assert.assertEquals("Gmail", "Manoj");
	}
	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("hiiii");
		
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName());
		
	}	

}
