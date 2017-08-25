package com.selenium.basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlartProg1
{
	public static void main(String[] args)
	{
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(obj, 30);
		
		//Open Application
		obj.get("file:///C:/Users/Monoj/Desktop/Doc/Selenium/selenium%20html%20files/Popup.html");
		obj.findElement(By.xpath("html/body/button")).click();

		//Wait for alert 
		wait.until(ExpectedConditions.alertIsPresent());
		//Switch to alert
		Alert A= obj.switchTo().alert();
		//Verify alert text
		if(A.getText().equals("Press a button!"))
		{
			System.out.println("You pressed OK Button!");
		}
		//Click Ok
		A.dismiss();
		obj.close();
		//obj.quit();
	}

}
