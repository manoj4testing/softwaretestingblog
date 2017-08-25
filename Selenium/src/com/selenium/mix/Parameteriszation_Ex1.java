package com.selenium.mix;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parameteriszation_Ex1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		String Uname,Pwd;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The User Name");
		Uname=s.nextLine();
		System.out.println("Enter The Password");
		Pwd=s.nextLine();
		WebDriver obj=new FirefoxDriver();
		obj.get("http://www.gmail.com");
		obj.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		obj.manage().window().maximize();
		obj.findElement(By.name("Email")).sendKeys(Uname);
		obj.findElement(By.name("signIn")).click();
		obj.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		obj.findElement(By.name("Passwd")).sendKeys(Pwd);
		obj.findElement(By.xpath(".//*[@id='signIn']")).click();
		//Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		obj.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		obj.close();
		

	}

}
