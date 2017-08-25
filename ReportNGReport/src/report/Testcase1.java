package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 
{
	WebDriver driver;
	@Test
	public void tc1()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void tc2()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Assert.assertEquals("Gmail", "Manoj");
	}	

}
