package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class temp 
{
	public static void main(String[] args)
	{
		WebDriver obj=new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		
		//The TextBox is enabled or not
		boolean b= obj.findElement(By.name("comments")).isEnabled();
		System.out.println(b);
		
		//Targeted select box is multiple select box or not 
		//means we can select multiple options from that select box or not
		
		/*Select sel=new Select(obj.findElement(By.xpath("//*[@id='HTMLFormElements']/table/tbody/tr[7]/td/select")));
		boolean value = sel.isMultiple();
		System.out.print(value);*/
		
		/*Select sel1=new Select(obj.findElement(By.name("dropdown")));
		sel1.selectByIndex(4);
		List<WebElement> li=sel1.getOptions();
		System.out.println("Number of elments-"+li.size());
		sel1.selectByIndex(5);
		for(int i=0;i<=li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}*/
	}
}
