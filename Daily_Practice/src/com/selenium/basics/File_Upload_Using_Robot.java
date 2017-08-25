package com.selenium.basics;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class File_Upload_Using_Robot
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.xpath("//*[@id='pim']/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(we).build().perform();
		WebElement we1=driver.findElement(By.xpath("//*[@id='pim']/ul/li[2]/a/span"));
		act.moveToElement(we1).click().build().perform();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Pradhan");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Monoj");

		
		//Handling windows based control 
		StringSelection sel = new StringSelection("C:\\Users\\Monoj\\Desktop\\a.png");
		// Copy to ClipBoard 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		driver.findElement(By.name("photofile")).click();
		Robot robot = new Robot();
		Thread.sleep(1000);
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("btnEdit")).click();
	}
}
