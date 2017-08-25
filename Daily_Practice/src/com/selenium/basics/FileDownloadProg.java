package com.selenium.basics;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadProg 
{
	public static void main(String[] args)throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("java download");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Download Free Java Software")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div/a/span")).click();
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div/a/span")).click();
		Thread.sleep(2000);
		//Handling windows based control 
		Robot robj=new Robot();
		robj.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robj.keyPress(KeyEvent.VK_ENTER);
		
		driver.close();
		driver.quit();
		
	}
}
