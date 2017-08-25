package com.selenium.mix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Youtubeplay {

	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		// TODO Auto-generated method stub
		WebDriver obj= new FirefoxDriver();
		obj.get("http://www.youtube.com");
		obj.manage().window().maximize();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/div/input")).sendKeys("SANAM RE Title Song FULL VIDEO");
		obj.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/button")).click();
		Thread.sleep(5000);
		//obj.findElement(By.partialLinkText("SANAM RE Title  Song FULL VIDEO")).click();
		Screen s=new Screen();
		Pattern p=new Pattern("G:\\Sikuliimages\\SANAM RE.JPG");
		s.click(p);
		Thread.sleep(10000);
		Pattern p1=new Pattern("G:\\Sikuliimages\\SKIP.JPG");
		if(s.exists(p1)!=null)
		{
		s.click(p1);
		}
		Thread.sleep(10000);
		s.click("G:\\Sikuliimages\\Sound.PNG");
		s.dragDrop("G:\\Sikuliimages\\Low Volume.PNG", "G:\\Sikuliimages\\Full Volume.PNG");
		

	}

}
