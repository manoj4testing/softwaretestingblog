package com.toolsqa.FinalPomFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.close();

	}

}
