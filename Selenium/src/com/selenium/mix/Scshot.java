package com.selenium.mix;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.sun.jna.platform.FileUtils;

public class Scshot {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("C:\\Users\\my\\Desktop\\test.html");
		EventFiringWebDriver efwd=new EventFiringWebDriver(driver);
		File src=efwd.getScreenshotAs(OutputType.FILE);
		File dsrc=new File("sc1.png");
		org.apache.commons.io.FileUtils.copyFile(src, dsrc);
		
		
		

	}

}
