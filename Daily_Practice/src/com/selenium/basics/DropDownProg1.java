package com.selenium.basics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownProg1
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception
	{		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Dropdown.html");
		WebElement we=obj.findElement(By.name("Mobiles"));
		Select sel=new Select(we);
		List<WebElement> li=sel.getOptions();
		sel.selectByVisibleText("Nokia");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		//System.out.println("Number of elements:-"+li.size());
		//Thread.sleep(1000);
		//sel.selectByVisibleText("HTC");
		//Thread.sleep(1000);
		//sel.selectByValue("1");
		//Print all options 
		/*for(WebElement e:li)
		{
			//String Name=li.get(i).getText();
			System.out.println(e.getText());
		}*/
		//obj.close();
		obj.quit();
	}
}
