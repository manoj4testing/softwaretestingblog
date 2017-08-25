package com.selenium.basics;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyBrokenLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total No Of Links :- "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement el=links.get(i);
			String url=el.getAttribute("href");
			verifylink(url);
		}
	}
	public static void verifylink(String linkurl)
	{
		try
		{
		URL url=new URL(linkurl);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(3000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println(linkurl+" - "+connection.getResponseMessage());
		}
		if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+"-"+connection.getResponseMessage());
		}
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
