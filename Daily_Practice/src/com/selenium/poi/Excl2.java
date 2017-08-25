package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excl2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	{
		File fo=new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\demo.xlsx");
		FileInputStream fi=new FileInputStream(fo);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh1=wb.getSheetAt(0);    //.xlsx---->XSSF
			   							   //.xls----->HSSF
		int rc=sh1.getLastRowNum();     
		System.out.println("Row count:-"+(rc+1));
		int cc=sh1.getRow(rc).getLastCellNum();
		System.out.println(cc);
		for(int i=0;i<=rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				String data=sh1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
			}
			System.out.println();
		}
	}
}
