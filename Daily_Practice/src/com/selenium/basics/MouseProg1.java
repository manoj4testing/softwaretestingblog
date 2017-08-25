package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseProg1
{
	public static void main(String[] args) throws Exception
	{
		
		FirefoxDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.navigate().to("https://www.rightstart.com/");
		Thread.sleep(2000);
		obj.findElement(By.id("x-mark-icon")).click();
		Actions act=new Actions(obj);
		WebElement e=obj.findElement(By.id("navigation-top-cat-label-343"));
		act.moveToElement(e).build().perform();
		Thread.sleep(2000);
		
		e=obj.findElement(By.xpath("//*[@id='navigation-top-cat-label-2719']/span"));
		act.moveToElement(e).build().perform();
		Thread.sleep(2000);
		
		e=obj.findElement(By.id("navigation-top-cat-label-2723"));
		act.moveToElement(e).click().build().perform();
		
	}
}
