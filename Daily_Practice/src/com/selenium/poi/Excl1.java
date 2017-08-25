package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excl1
{
	public static void main(String[] args) throws IOException, Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		File f1=new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\demo.xlsx");
		FileInputStream fn=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fn);
		XSSFSheet sh1=wb.getSheetAt(0);	
		int rowc=sh1.getLastRowNum();
		System.out.println("Total no of rowa:-"+rowc);
		for(int i=1;i<=rowc;i++)
		{
			String data=sh1.getRow(i).getCell(0).getStringCellValue();
			String data1=sh1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data+ " " + data1);

			driver.findElement(By.name("txtUserName")).clear();
			driver.findElement(By.name("txtUserName")).sendKeys(data);
			
			driver.findElement(By.name("txtPassword")).sendKeys(data1);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);	
		}
		
		/*sh1.getRow(0).createCell(2).setCellValue("Result");
		FileOutputStream fo=new FileOutputStream(f1);
		wb.write(fo);
		String d=sh1.getRow(0).getCell(2).getStringCellValue();
		*/
	
		/*String data=sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1=sh1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);*/
		wb.close();
		wb.close();
	}
}
