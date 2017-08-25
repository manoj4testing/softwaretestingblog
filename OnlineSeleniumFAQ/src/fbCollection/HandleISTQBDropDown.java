package fbCollection;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleISTQBDropDown
{
	public static void movetoMenu(WebDriver driver,String menu) throws InterruptedException
	{
		Actions actions=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//span[text()='"+menu+"']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(e));
		actions.moveToElement(e).perform();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://istqb.in/");
		movetoMenu(driver,"FOUNDATION");
		movetoMenu(driver,"ENROLLMENT");
		movetoMenu(driver,"CORPORATE ENROLLMENT");
		driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
	}
}