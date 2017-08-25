package com.selenium.basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Popup.html");
		driver.findElement(By.xpath("html/body/button")).click();
		//driver.switchTo().alert();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		alt.accept();
	
		
	}
}
