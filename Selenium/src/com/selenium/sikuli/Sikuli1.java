package com.selenium.sikuli;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
	{
		Screen s=new Screen();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.millionclouds.com/");
		Thread.sleep(5000);
		//s.click("G:\\Base_Workspace\\Neon\\Selenium\\IMG_Sikuli\\IMG_login1.PNG");
		String img1="G:\\Base_Workspace\\Neon\\Selenium\\IMG_Sikuli\\IMG_login1.PNG";
		String img2="G:\\Base_Workspace\\Neon\\Selenium\\IMG_Sikuli\\IMG_Register.PNG";
		Finder f=new Finder(img1);
		Pattern p=new Pattern(img2);
		f.find(p);
		if(f.hasNext())
		{
			System.out.println("Image Found");
		}
		else
		{
			System.out.println("Image Not Found");
		}
	}

}
