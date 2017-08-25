package com.selenium.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAndParameter 
{
	@Test
    public void testImageShown(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://dl.dropboxusercontent.com/u/3147870/broken_image.html");
        WebElement brokenImage = driver.findElement(By.xpath("//div[@id=\"1\"]/img"));
        WebElement notSoBroken = driver.findElement(By.xpath("//div[@id=\"2\"]/img"));

        WrapsDriver wrapsDriver = (WrapsDriver) brokenImage;
        String script = "return (typeof arguments[0].naturalWidth!=\"undefined\"" +
                " && arguments[0].naturalWidth>0)";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wrapsDriver.getWrappedDriver();
        Object isBrokenShown = javascriptExecutor.executeScript(script, brokenImage);
        Object isNotBrokenShown = javascriptExecutor.executeScript(script, notSoBroken);
    }

}
