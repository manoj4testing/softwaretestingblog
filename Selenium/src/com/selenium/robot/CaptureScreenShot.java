package com.selenium.robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CaptureScreenShot 
{
	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	}
	
	@Test
	public void operation() throws Exception
	{
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("user1");
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[4]/td[1]/input")).click();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='pim']/a/span")).click();
		driver.findElement(By.xpath("//*[@id='pim']/ul/li[2]/a/span")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='photofile']")).click();
		StringSelection path=new StringSelection("C:\\Users\\Rana\\Desktop\\sherlyn chopra new nude photoshoot.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
	}
}
