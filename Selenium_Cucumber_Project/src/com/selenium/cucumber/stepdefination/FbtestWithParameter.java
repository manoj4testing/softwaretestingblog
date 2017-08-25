package com.selenium.cucumber.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbtestWithParameter 
{
	WebDriver driver;
	@Given("^Open Firefox and Start Application$")
	public void Open_Firefox_and_Start_Application() throws Throwable 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@When("^i Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_Enter_valid_username_and_password(String Uname, String pwd) throws Throwable 
	{
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(Uname);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pwd);
	    
	}

	@Then
	("^user should be able to login sucessfully$")
	public void user_should_be_able_to_login_sucessfully() throws Throwable 
	{
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).submit();
	    
	}

}
