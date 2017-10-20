package com.selenium.mix;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAutocompleteBox {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("hi");
		List<WebElement> str=driver.findElements(By.tagName("li"));
		System.out.println(str.size());
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i).getText());
			if(str.get(i).toString()=="hi")
			str.get(i).click();
		}
		
		

	}

}
