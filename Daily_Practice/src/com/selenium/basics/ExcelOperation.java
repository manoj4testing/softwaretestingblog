package com.selenium.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws IOException {
		File Src=new File("G:\\Base_Workspace\\Neon\\Daily_Practice\\src\\demo.xlsx");
		FileInputStream fis=new FileInputStream(Src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//String SHname=wb.getSheetName(0);
		XSSFSheet sh=wb.getSheetAt(0);
		int rowno=sh.getLastRowNum();
		int colno=sh.getRow(rowno).getLastCellNum();
		for(int i=1;i<=rowno;i++)
		{
			
			System.out.println(colno);
			try
			{
			for(int j=0;j<=colno;j++)
			{
				
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
			sh.getRow(i).createCell(2).setCellValue("Pass");
			FileOutputStream fs=new FileOutputStream(Src);
			wb.write(fs);
			}
			catch(Exception E)
			{
				sh.getRow(i).createCell(2).setCellValue("Fail");
				FileOutputStream fs=new FileOutputStream(Src);
				wb.write(fs);
			}
			/*try{
				System.out.println(colno);
				if( sh.getRow(i).getCell(j).getStringCellValue().equals(null))
				{
					sh.getRow(i).createCell(2).setCellValue("Fail");
					continue;
				}
				else
				{
					
				username=sh.getRow(i).getCell(j).getStringCellValue();
				password=sh.getRow(i).getCell(j+1).getStringCellValue();
				System.out.println("Username : "+username +"\t"+"Password : "+password);
				sh.getRow(i).createCell(2).setCellValue("Pass");
				FileOutputStream fs=new FileOutputStream(Src);
				wb.write(fs);
					
				}
				}
				catch (Exception e)
				{
					sh.getRow(i).createCell(2).setCellValue("Fail");
					FileOutputStream fs=new FileOutputStream(Src);
					wb.write(fs);
				}

*/
		}

	}

}
