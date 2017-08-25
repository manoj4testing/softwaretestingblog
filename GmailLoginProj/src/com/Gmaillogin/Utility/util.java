package com.Gmaillogin.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class util 
{
	public static WebDriver driver;

	//For Select The Proper Browser
	public static WebDriver selectBrowser(String browser)
	{
		if(browser.equals("firefox") || browser.equals("FIREFOX"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		else if(browser.equals("chrome")||browser.equals("CHROME"))
		{
			String chromedriver=System.getProperty("user.dir")+"\\src\\com\\Gmaillogin\\BrowserDrivers\\chromedriver.exe";
			System.out.println(chromedriver);
			System.setProperty("webdriver.chrome.driver",chromedriver);
			driver=new ChromeDriver();
			//driver.manage().window().maximize();
			return driver;
		}
		else if(browser.equals("ie") || browser.equals("IE"))
		{
			String iedriver=System.getProperty("user.dir")+"\\src\\com\\Gmaillogin\\BrowserDrivers\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iedriver);
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}

	//For ImplicityWait
	public void implicitwait(int timeinsec)
	{
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
	}

	//for OpenUrl
	public void opensite(String url)
	{
		driver.get(url);
	}

	//for wait or thread.sleep
	public void driverwait(int timeinsec) throws InterruptedException
	{
		Thread.sleep(timeinsec);
	}

	public static WebDriver sendkeys(WebElement element,String data)
	{
		element.sendKeys(data);
		return null;
	}
	public static WebDriver submit(WebElement btn)
	{
		btn.submit();
		return null;
	}
	public static WebDriver click(WebElement btn)
	{
		btn.click();
		return null;
	}
	public static void close()
	{
		driver.close();
	}
	public static void quit()
	{
		driver.quit();
	}
}
