package com.toolsqa.FinalPomFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEexcel 
{
	private String uname=null;
	@Test(dataProvider="POIRead")
	public void excelr(String username,String passwd) 
	{
		String uname=username;
		String pwd=passwd;
		System.out.println(uname+"\t"+pwd);


	}
	@SuppressWarnings("null")
	@DataProvider(name="POIRead")
	public Object[][] readdata() throws IOException
	{
		String[][] data = data = new String[3][2];;
		File src=new File("G:\\Base_Workspace\\Luna\\DailyPractice\\loginDetails.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int rowno=sh.getLastRowNum();
		for(int i=0;i<rowno;i++)
		{
			int colno=sh.getRow(i).getLastCellNum();
			for(int j=0;j<colno;j++)
			{
				
				System.out.println(i+"\t"+j);
				String x=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(x);
				data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);

			}
		}
		return data;
	}

}
