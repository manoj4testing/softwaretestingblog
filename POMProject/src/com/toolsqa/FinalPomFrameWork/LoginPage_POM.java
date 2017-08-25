package com.toolsqa.FinalPomFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_POM 
{
	public WebDriver driver;
	@FindBy(id="log")
	WebElement Txtbox_username;
	@FindBy(id="pwd")
	WebElement Txtbox_pwd;
	@FindBy(id="login")
	WebElement btn_login;
	public LoginPage_POM(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	public void enterLogin() 
	{
		Txtbox_username.sendKeys("vvvvvv");
	}
	public void enterPass() 
	{
		Txtbox_pwd.sendKeys("hhhhhhhh");
	}
	public void clickLogin() {
		btn_login.click();
	}
}
