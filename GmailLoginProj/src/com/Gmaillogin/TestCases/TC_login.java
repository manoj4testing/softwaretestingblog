package com.Gmaillogin.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Gmaillogin.GenericLib.testbase;
import com.Gmaillogin.Utility.util;

public class TC_login extends testbase
{
	@BeforeClass
	public void setup() throws Exception
	{
		init();
	}
	@Test
	public void login() throws Exception
	{
		util.selectBrowser(pro.getProperty("browser_name"));
		implicitwait(5000);
		opensite("http://www.gmail.com");
		implicitwait(5000);
		util.sendkeys(getWebElement("gmail.login.enterusername"), "iammkrana@gmail.com");
		util.submit(getWebElement("gmail.login.submitusername"));
		util.sendkeys(getWebElement("gmail.login.enterpassword"), "love");
		util.click(getWebElement("gmail.login.submitpassword"));
	}
	@AfterClass
	public void teardown()
	{
		util.close();
	}

}
