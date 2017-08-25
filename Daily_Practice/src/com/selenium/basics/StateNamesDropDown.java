package com.selenium.basics;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StateNamesDropDown 
{
	public static void main(String[] args) 
	{
		int i,j;
		String s="",s1="";
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		final String url="file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Statenames.html";
		obj.get(url);
		
		WebElement we=obj.findElement(By.xpath("html/body/select"));
		Select sel=new Select(we);
		ArrayList<WebElement> li=(ArrayList<WebElement>) sel.getOptions();

		ArrayList<String> arrayList=new ArrayList<>();
		for (WebElement e : li)
		{
			arrayList.add(e.getText());
		}
		Collections.sort(arrayList);
		System.out.println("---------Expected  Data-------------");
		//System.out.println("Sorting of the array"+arrayList);
		for ( i = 0; i < arrayList.size()-1; i++)
		{
			s=arrayList.get(i);
			System.out.println(s);
		}

		System.out.println("-----------Actual  Data--------------");
		for( j=1;j<li.size();j++)
		{
			s1=li.get(j).getText();
			System.out.println(s1);
		}

		System.out.println("-----------RESULT--------------");

		if(s.equals(s1))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
		obj.quit();
	}
}

