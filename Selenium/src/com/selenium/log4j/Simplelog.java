package com.selenium.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simplelog {

	public static void main(String[] args) {

		Logger log=Logger.getLogger("Simplelog");
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver=new FirefoxDriver();
		log.info("Firefox Browser Opened");
		driver.close();

	}

}
