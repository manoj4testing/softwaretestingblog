package com.selenium.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/span")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		List<WebElement> li=driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		int size1=li.size();
		System.out.println(size1);
		for(int i=0;i<size1;i++)
		{
			String date=li.get(i).getText();
			System.out.println(date);
			if(date.equals("29"))
			{
				li.get(i).click();
			}
			
				
		}

	}

}
