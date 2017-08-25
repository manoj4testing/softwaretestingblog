package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadANDWrite 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		FileInputStream	fis=new FileInputStream(new File("//C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\Exl\\Testdata writed.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int Rows=sheet.getLastRowNum();
		System.out.println("Rows="+Rows);
		int Cls=sheet.getRow(Rows).getLastCellNum();
		System.out.println("columns="+Cls);
		for(int i=0;i<=Rows;i++)
		{
			for(int j=0;j<=Cls;j++)
			{
				String str=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print( str+"  ");
			}
			System.out.println( );
		}
		/*sheet.getRow(0).createCell(2).setCellValue("2.41.0");
		sheet.getRow(1).createCell(2).setCellValue("2.5");
		sheet.getRow(2).createCell(2).setCellValue("2.39");
		sheet.getRow(3).createCell(2).setCellValue("i am an Indian");
		sheet.getRow(4).createCell(2).setCellValue("Good");*/
		
		FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\Exl\\Testdata writed1.xlsx"));
		workbook.write(fos);
	}
}
