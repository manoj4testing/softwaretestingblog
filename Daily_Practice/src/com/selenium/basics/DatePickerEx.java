package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerEx
{
	public static void main(String[] args)throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tripadvisor.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='rdoFlights']/div/span")).click();
		driver.findElement(By.id("metaFlightFrom")).sendKeys("Bangalore");
		driver.findElement(By.id("metaFlightTo")).sendKeys("Hyderabad");
	}
}
