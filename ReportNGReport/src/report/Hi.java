package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hi 
{
	@Test
	public void hi()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
