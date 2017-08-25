package com.selenium.onlinefaq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindMaxPrice {

	public static void main(String[] args) throws IOException
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
