package com.toolsqa.FinalPomFrameWork;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import com.toolsqa.FinalPomFrameWork.HomePage_POM;
import com.toolsqa.FinalPomFrameWork.LoginPage_POM;

public class Login_TestCase {

	static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		//HomePage_POM homepage = new HomePage_POM(driver) ;
		//LoginPage_POM loginpage =new LoginPage_POM(driver);
		
		HomePage_POM homepage = PageFactory.initElements(driver, HomePage_POM.class);
		LoginPage_POM loginpage = PageFactory.initElements(driver, LoginPage_POM.class);
		homepage.clickOnHomepage();
		loginpage.enterLogin();
		loginpage.enterPass();
		loginpage.clickLogin();
		driver.close();

	}

}
