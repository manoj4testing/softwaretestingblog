package com.toolsqa.FinalPomFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.toolsqa.FinalPomFrameWork.HomePage_POM_DataProvider;
import com.toolsqa.FinalPomFrameWork.LoginPage_POM_DataProvider;

public class Login_TestCasewith_DataProvider {

	static WebDriver driver=null;
	HomePage_POM_DataProvider homepage = PageFactory.initElements(driver, HomePage_POM_DataProvider.class);
	LoginPage_POM_DataProvider loginpage = PageFactory.initElements(driver, LoginPage_POM_DataProvider.class);
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		//HomePage_POM homepage = new HomePage_POM(driver) ;
		//LoginPage_POM loginpage =new LoginPage_POM(driver);
		
		homepage.clickOnHomepage();
	}
	@Test(dataProvider="POIRead")
	public void login(String uname,String pwd)
	{
		loginpage.enterLogin(uname);
		loginpage.enterPass(pwd);
		loginpage.clickLogin();
		
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@SuppressWarnings("null")
	@DataProvider(name="POIRead")
	public Object[][] readdata() throws IOException
	{
		String[][] data = new String[3][2];;
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
				
				//System.out.println(i+"\t"+j);
				String x=sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(x);
				data[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(data);

			}
		}
		return data;
	}

	
}
