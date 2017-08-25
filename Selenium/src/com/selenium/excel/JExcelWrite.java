package com.selenium.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class JExcelWrite 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
	{
		String s="Manoj Kumar Rana";
		File Source=new File("G:\\Selenium\\AllSelenium\\JExcel.xls");
		@SuppressWarnings("unused")
		FileOutputStream fout=new FileOutputStream(Source);
		WritableWorkbook wwb=Workbook.createWorkbook(Source);
		WritableSheet wsh=wwb.createSheet("Sheet5", 2);
		Label l=new Label(0, 2, s);
		wsh.addCell(l);
		wwb.write();
		wwb.close();

	}


}
