package com.jenkin.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		System.out.println("Operation Sucessfull");
		driver.close();
	}

}
