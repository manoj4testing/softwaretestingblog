package com.selenium.action;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Open_New_Tab
{
	@Test
    public void openNewTab() throws InterruptedException

    {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://www.gmail.com");
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"w");
        Thread.sleep(5000);
    }

}
