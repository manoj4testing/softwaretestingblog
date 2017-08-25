package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateIssue {

	public static void main(String[] args) 
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cacert.org/");
		driver.close();
	}

}
