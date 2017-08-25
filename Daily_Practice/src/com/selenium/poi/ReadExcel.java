package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException 
	{
		File source=new File("G:\\Selenium\\AllSelenium\\ApachePOIExcel.xlsx");
		FileInputStream fis=new FileInputStream(source);
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int rowno=sh.getLastRowNum();
		int col=sh.getRow(rowno).getLastCellNum();
		//System.out.println(col);
		System.out.println(rowno);
		for(int i=0;i<=rowno;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
				
			}
			System.out.println();
		}
		

	}

}
