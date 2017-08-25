package com.toolsqa.POMautomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase_POF 
{
	static WebDriver driver;
	
	//1. Define The Elements Of the Login Page
	@FindBy(id="account")
	@CacheLookup
	static WebElement myac_link;
	@FindBy(id="log")
	static WebElement Txtbox_username;
	@FindBy(id="pwd")
	static WebElement Txtbox_pwd;
	@FindBy(id="login")
	static WebElement btn_login;

	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//2. The Elements are Not instantiated, So instantiated by using Init Methods
		PageFactory.initElements(driver, TestCase_POF.class);
		
		//3. After Instantiated We Can Used the Define WebElements
		myac_link.click();
		Txtbox_username.sendKeys("vvvv");
		Txtbox_pwd.sendKeys("nnnnn");
		btn_login.click();
		driver.close();
		System.out.println("Executed Sucessfully");
	}

}
