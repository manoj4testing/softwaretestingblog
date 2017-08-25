package com.selenium.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JExcelRead {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws BiffException, IOException 
	{
		File Source=new File("G:\\Selenium\\AllSelenium\\JExcel.xls");
		@SuppressWarnings("unused")
		FileInputStream fis=new FileInputStream(Source);
		Workbook wb=Workbook.getWorkbook(Source);
		Sheet sh=wb.getSheet(0);
		String data=sh.getCell(0, 0).getContents();
		System.out.println(data);

	}

}
