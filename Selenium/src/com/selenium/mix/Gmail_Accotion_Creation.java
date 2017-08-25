package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Accotion_Creation {

	public static void main(String[] args) throws InterruptedException 
	{
		// Create a Gmail Account
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.gmail.com/");
		obj.manage().window().maximize();
		obj.findElement(By.linkText("Create account")).click();
		obj.findElement(By.name("FirstName")).sendKeys("Manoj");
		obj.findElement(By.name("LastName")).sendKeys("Rana");
		obj.findElement(By.name("GmailAddress")).sendKeys("manojrana0789");
		obj.findElement(By.name("Passwd")).sendKeys("loveu@0733");
		obj.findElement(By.name("PasswdAgain")).sendKeys("loveu@0733");
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[5]/fieldset/label[1]/span/div")).sendKeys(Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		obj.findElement(By.name("BirthDay")).sendKeys("6");
		obj.findElement(By.name("BirthYear")).sendKeys("1986");
		obj.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div")).sendKeys(Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		obj.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9063426783");
		obj.findElement(By.name("RecoveryEmailAddress")).sendKeys("djsmuzikinfo@gmail.com");
		obj.findElement(By.name("SkipCaptcha")).click();
		obj.findElement(By.name("TermsOfService")).click();
		Thread.sleep(3000);
		obj.close();
		

	}

}
