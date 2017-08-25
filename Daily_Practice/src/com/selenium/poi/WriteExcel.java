package com.selenium.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File source=new File("G:\\Selenium\\AllSelenium\\ApachePOIExcel.xlsx");
		FileInputStream fis=new FileInputStream(source);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		sh.getRow(0).createCell(0).setCellValue("Kumar");
		sh.getRow(0).createCell(1).setCellValue("Rana");
		sh.getRow(0).createCell(2).setCellValue("Rana King");
		FileOutputStream fout=new FileOutputStream(source);
		wb.write(fout);
		wb.close();
		
		

	}

}
