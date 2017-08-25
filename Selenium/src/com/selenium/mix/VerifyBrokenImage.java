package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyBrokenImage {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "chrome driver path");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Manoj/Desktop/brokenimage.html");
		WebElement img= driver.findElement(By.xpath("html/body/img"));
		String script = "return (typeof arguments[0].naturalWidth!=\"undefined\" && arguments[0].naturalWidth>0)";
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		Object status= jse.executeScript(script, img);
		if(status.equals(false))
		{
		System.out.println("broken image");
		}

	}

}
