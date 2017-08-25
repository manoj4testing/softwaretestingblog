package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class POIusing_jxlFile
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		FileInputStream fi=new FileInputStream(new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\Exl\\test.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fi);
		HSSFSheet sh=wb.getSheet("a");
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			String usName=sh.getRow(i).getCell(0).getStringCellValue();
			String usPsw=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(usName+" "+usPsw);

			sh.getRow(i).createCell(2).setCellValue("pass");
			FileOutputStream fo=new FileOutputStream(new File("C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\Exl\\test.xls"));
			wb.write(fo);
			
		}

	}
}
