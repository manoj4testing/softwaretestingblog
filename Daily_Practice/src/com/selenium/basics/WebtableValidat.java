package com.selenium.basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtableValidat 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int tot=0;
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/WebTable1.html");
		List<WebElement> li=obj.findElements(By.xpath("html/body/table/tbody/tr"));
		System.out.println(li.size());
		for(int i=1;i<li.size();i++)
		{
			li.get(i).getText();
			//String x=li.get(i).getText();
			System.out.println(li.get(i).toString());
		}
	}
}
