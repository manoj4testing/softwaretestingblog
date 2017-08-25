package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ex1
{
	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Files\\geckodriver.exe");
		FirefoxDriver obj=new FirefoxDriver();
		//Maximize Browser 
		obj.manage().window().maximize();
		
		//Open Application 
		obj.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(2000);
		
		//Type user Name
		obj.findElement(By.name("txtUserName")).clear();
		obj.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		
		//Type password 
		obj.findElement(By.name("txtPassword")).clear();
		obj.findElement(By.name("txtPassword")).sendKeys("user1");
		
		//Click login
		obj.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		
		//Click LogOut
		obj.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		obj.close();
		obj.quit();
	}
}

