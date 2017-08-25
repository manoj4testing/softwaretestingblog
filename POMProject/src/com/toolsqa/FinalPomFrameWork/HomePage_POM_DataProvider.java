package com.toolsqa.FinalPomFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_POM_DataProvider 
{
	public WebDriver driver;

	@FindBy(id="account")
	WebElement myac_link;

	public HomePage_POM_DataProvider(WebDriver ldriver)
	{
	this.driver=ldriver;
	}
	public void clickOnHomepage() 
	{
	myac_link.click();
	}
}
