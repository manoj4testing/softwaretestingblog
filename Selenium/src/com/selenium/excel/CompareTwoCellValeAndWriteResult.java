package com.selenium.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareTwoCellValeAndWriteResult {

	public static void main(String[] args) throws IOException 
	{
		File source=new File("G:\\Selenium\\AllSelenium\\ApachePOIExcel.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		String FirstValue=sh.getRow(3).getCell(0).getStringCellValue();
		System.out.println(FirstValue);
		String SeconfValue=sh.getRow(3).getCell(1).getStringCellValue();
		System.out.println(SeconfValue);
		if(FirstValue.equals(SeconfValue))
		{
			sh.getRow(3).createCell(3).setCellValue("Matched");
			FileOutputStream fout=new FileOutputStream(source);
			wb.write(fout);
			wb.close();
		}
		else
			System.out.println("Value Is Not Matched");

	}

}
