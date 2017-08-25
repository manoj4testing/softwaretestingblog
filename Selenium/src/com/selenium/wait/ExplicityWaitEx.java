package com.selenium.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicityWaitEx 
{
	@Test
	public void operation()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebDriverWait wait=new WebDriverWait(driver, 200);
		WebElement Gmail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a")));
		Gmail.click();	
		driver.close();
	}

}
