package com.selenium.actions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenNewTab 
{
	@Test
    public void openNewTab() throws InterruptedException

    {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        driver.get("https://www.gmail.com.com");
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
    }

}
