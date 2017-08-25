package com.selenium.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBfaq 
{  
	WebDriver driver=new FirefoxDriver();

	@Test
	public void getMaxPrice() throws InterruptedException 
	{
		driver.get("https://www.walmart.com/browse/clothing/handbags/5438_1045799_1045800?sort=price_high");
		Thread.sleep(3000);
		List<WebElement> values=driver.findElements(By.xpath("//span[@class='price price-display']"));
		List<String> prices = new ArrayList<String>() ;
		for (int i=0;i<values.size();i++)
		{
			String [] tmp = values.get(i).getText().split("\n");
			String addString = tmp[0]+tmp[1]+tmp[2];
			addString=addString.substring(1, addString.length());
			addString=addString.replace(",", "");
			prices.add(addString);	
		}
		System.out.println( "All Prices " + prices);
		System.out.println("Max Price " + Collections.max(prices));
	}
}