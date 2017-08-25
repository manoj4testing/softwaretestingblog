package com.toolsqa.FinalPomFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_POM_DataProvider 
{
	public WebDriver driver;
	@FindBy(id="log")
	WebElement Txtbox_username;
	@FindBy(id="pwd")
	WebElement Txtbox_pwd;
	@FindBy(id="login")
	WebElement btn_login;
	public LoginPage_POM_DataProvider(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	public void enterLogin(String username) 
	{
		Txtbox_username.sendKeys(username);
	}
	public void enterPass(String pwd) 
	{
		Txtbox_pwd.sendKeys(pwd);
	}
	public void clickLogin() {
		btn_login.click();
	}
}
