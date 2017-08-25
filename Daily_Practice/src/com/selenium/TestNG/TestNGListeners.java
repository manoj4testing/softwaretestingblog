package com.selenium.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener 
{

	@Override
	public void onFinish(ITestContext result) {
		
		
	}

	@Override
	public void onStart(ITestContext result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Your Test Failed" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Your Test Skipped" + result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Your Test Start Sucessfully" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Your Test Finish Sucessfully" + result.getName());
	}
	

}
