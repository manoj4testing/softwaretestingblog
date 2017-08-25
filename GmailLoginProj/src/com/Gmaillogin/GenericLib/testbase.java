package com.Gmaillogin.GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.Gmaillogin.Utility.util;
public class testbase extends util
{
	public Properties pro=new Properties();
	public File loginfile,selebrowser;

	//load properties files
	public void loadproperties() throws IOException
	{
		//load login properties file
		loginfile=new File(System.getProperty("user.dir")+"\\src\\com\\Gmaillogin\\Propertiesfiles\\login.properties");
		FileInputStream fis_login=new FileInputStream(loginfile);
		pro.load(fis_login);

		//load selectbrowser file
		selebrowser=new File(System.getProperty("user.dir")+"\\src\\com\\Gmaillogin\\Propertiesfiles\\selectbrowser.properties");
		FileInputStream fis_selectbrowser=new FileInputStream(selebrowser);
		pro.load(fis_selectbrowser);
	}

	//get the locator Details
	public static WebElement getlocator(String locator) throws Exception
	{
		//here we are divide the value part into type and value
		String locator_type=locator.split("_")[0];
		String locator_value=locator.split("_")[1];

		if(locator_type.toLowerCase().equals("id"))
			return driver.findElement(By.id(locator_value));
		else if(locator_type.toLowerCase().equals("name"))
			return driver.findElement(By.name(locator_value));
		else if(locator_type.toLowerCase().equals("class") || locator_type.toLowerCase().equals("classname"))
			return driver.findElement(By.className(locator_value));
		else if(locator_type.toLowerCase().equals("tag")||locator_type.toLowerCase().equals("tagname"))
			return driver.findElement(By.tagName(locator_value));
		else if(locator_type.toLowerCase().equals("xpath"))
			return driver.findElement(By.xpath(locator_value));
		else if(locator_type.toLowerCase().equals("css"))
			return driver.findElement(By.cssSelector(locator_value));
		else if(locator_type.toLowerCase().equals("linktext")||locator_type.toLowerCase().equals("link"))
			return driver.findElement(By.linkText(locator_value));
		else if(locator_type.toLowerCase().equals("partiallinktext"))
			return driver.findElement(By.partialLinkText(locator_value));
		else
			throw new Exception("Unknow Locator type"+locator_type+"");

	}

	//locate a Element
	public WebElement getWebElement(String locator) throws Exception
	{
		return getlocator(pro.getProperty(locator));
	}

	//Start Action Here
	public void init() throws Exception
	{
		loadproperties();
	}

}
