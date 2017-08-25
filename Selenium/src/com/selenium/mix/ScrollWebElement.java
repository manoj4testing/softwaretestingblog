package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWebElement {

	public static void main(String[] args) throws InterruptedException 
	{
		/*FirefoxProfile profile=new FirefoxProfile();
		profile.setEnableNativeEvents(true);*/
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.id("draggable"));
		Actions actn=new Actions(driver);
		actn.dragAndDropBy(ele, 50, 50).build().perform();

	}

}
