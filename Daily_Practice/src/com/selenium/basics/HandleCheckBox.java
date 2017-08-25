package com.selenium.basics;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCheckBox
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Checkbox1.html");
		List <WebElement> l1=obj.findElements(By.name("vehicle"));
		
		/*int rc=l1.size();
		System.out.println("Row count:-"+rc);
		for(int i=0;i<=rc;i++)
		{
			//l1.get(i).click();
			obj.findElement(By.xpath("html/body/table/tbody/tr["+(i+2)+"]/td[3]/input")).click();
		}*/
		obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    int CHC=0, UHC=0;
	    for(int i=0; i<l1.size(); i++)
	    {
	    	System.out.println(i+" checkbox is selected " +l1.get(i).isSelected());
	    	if(l1.get(i).isSelected())
	    	{
	    		CHC++;
	        }
	    	else
	    	{
	    		UHC++;
	        }
	    }
	        System.out.println("Number of selected checkbox: "+CHC);
	        System.out.println("Number of unselected checkbox: "+UHC);
	        //obj.close();
	        //obj.quit();
    }

}
