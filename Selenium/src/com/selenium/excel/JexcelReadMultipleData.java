package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JexcelReadMultipleData 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws BiffException, IOException 
	{
		File Source=new File("G:\\Selenium\\AllSelenium\\JExcel.xls");
		@SuppressWarnings("resource")
		FileInputStream fis=new FileInputStream(Source);
		Workbook wb=Workbook.getWorkbook(Source);
		Sheet sh=wb.getSheet(1);
		int rowno=sh.getRows();
		for(int i=0;i<rowno;i++)
		{
			
				String val1=sh.getCell(0, i).getContents();
				String val2=sh.getCell(1, i).getContents();
				System.out.println(val1 + "  "+val2);
				
			
		}
	}
}
