package com.selenium.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderEx 
{
	WebDriver driver;
	@Test(dataProvider="logindata")
	public void login(String Uname,String Pwd) throws InterruptedException
	{
		//System.out.println(Uname);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUserName")).sendKeys(Uname);
		driver.findElement(By.name("txtPassword")).sendKeys(Pwd);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.close();
	}

	@DataProvider (name="logindata")
	public  Object[][] readExcel() throws IOException, BiffException
	{
		String source="G:\\Selenium\\AllSelenium\\DataProviderExcelJXL.xls";
		FileInputStream fis=new FileInputStream(source);
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet sh=wb.getSheet(0);
		int row=sh.getRows();
		int col=sh.getColumns();
		//System.out.println(row);
		Object obj[][]=new String[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Cell celldata=sh.getCell(j, i);
				obj[i][j]=celldata.getContents();
				System.out.println(obj[i][j]);
			}

		}
		return obj;
	}
}
