package com.selenium.basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable
{
	public static void main(String[] args)
	{
		FirefoxDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Webtable.html");
		
		//Get Row Count 
		int Rc=obj.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println("Row Count=" +Rc);
		
		//Get column Count
		int Cc=obj.findElements(By.xpath("html/body/table/tbody/tr[1]/td")).size();
		System.out.println("Column Count=" +Cc);
		
		//Get Cell Count
		int CellCount=obj.findElements(By.xpath("html/body/table/tbody/tr/td")).size();
		System.out.println("Total Cell Count=" +CellCount);
		
		//Print WebTable Data
		List <WebElement> TableData=obj.findElements(By.xpath("html/body/table/tbody/tr/td"));
		for(int i=0;i<TableData.size();i++)
		{
			String data=TableData.get(i).getText();
			System.out.print(data);
			System.out.println();
		}
		
		obj.close();
		obj.quit();
				
	}
}
