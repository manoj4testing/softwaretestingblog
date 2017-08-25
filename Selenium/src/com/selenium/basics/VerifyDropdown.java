package com.selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.id("month"));
		Select s=new Select(we);
		List<WebElement> li= s.getOptions();
		for(WebElement si:li)
		{
			String sa=si.getText().toString();
			System.out.println(sa);
			if(sa.equalsIgnoreCase("jul"))
			{
				si.click();
			}
		}

	}

}
