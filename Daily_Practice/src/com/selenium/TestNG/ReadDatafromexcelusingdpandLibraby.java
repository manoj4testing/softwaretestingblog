/*package com.selenium.TestNG;

import iibrary.Excelconfig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDatafromexcelusingdpandLibraby {
	
	String Data;

	@Test(dataProvider="wpdata")
	public void wordpresslogin(String Uname,String PWD) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/test/wp-admin/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys(Uname);
		driver.findElement(By.id("user_pass")).sendKeys(PWD);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();

	}
	
	@DataProvider(name="wpdata")
	public Object[][] wordpressdata()
	{
		Excelconfig readexcel=new Excelconfig("G:\\Selenium\\TestNGPractice\\TestData\\LoginData.xlsx");
		int rowcount=readexcel.rowcount(0);
		Object[][] Data=new Object[rowcount][2];
		for(int i=0;i<rowcount;i++)
		{
			Data[i][0]=readexcel.getdata(0,i, 0);
			Data[i][1]=readexcel.getdata(0, i, 1);
		}
		return Data;
	}

}
*/