package com.selenium.poi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class NumberReadInExcel 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		String path="C:\\Users\\Monoj\\Desktop\\Doc\\Selenium\\Exl\\num.xlsx";
		FileInputStream fi=new FileInputStream(new File(path));
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		int roc=sh.getLastRowNum();
		for(int i=0;i<=roc;i++)
		{
			int c1=(int)sh.getRow(i).getCell(0).getNumericCellValue();
			int c2=(int)sh.getRow(i).getCell(1).getNumericCellValue();
			int sum=c1+c2;
			System.out.println(c1+" "+c2+" "+sum);
			sh.getRow(i).createCell(2).setCellValue(sum);
			FileOutputStream fo=new FileOutputStream(path);
			wb.write(fo);
		}
	}
}
