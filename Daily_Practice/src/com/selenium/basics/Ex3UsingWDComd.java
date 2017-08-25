package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3UsingWDComd
{
	public static void main(String[] args)throws Exception
	{
		FirefoxDriver obj=new FirefoxDriver();
		//------------------------STEP-1--------------------------------
		//Open application 
		obj.get("http://apps.qaplanet.in/qahrm/login.php");
		obj.manage().window().maximize();
		if(obj.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Home page Displayed");
		}
		else
		{
			System.out.println("Home page not Displayed");
		}
		
		//Create reference object for UserName,Password,Login and Clear 
		WebElement objUN=obj.findElement(By.name("txtUserName"));
		WebElement objPWD=obj.findElement(By.name("txtPassword"));
		WebElement objLogin=obj.findElement(By.name("Submit"));
		WebElement objCLR=obj.findElement(By.name("clear"));
		
		//Verify UserName
		if(objUN.isDisplayed())
		{
			System.out.println("UserName Exist");
		}
		else
		{
			System.out.println("UserName Not Exist");
		}
		
		//Verify Password 
		if(objPWD.isDisplayed())
		{
			System.out.println("Password Exist");
		}
		else
		{
			System.out.println("Password Not  Exist");
		}
		
		//Verify Login and Clear Button 
		if(objLogin.isDisplayed() && objCLR.isDisplayed())
		{
			System.out.println("Login and Clear Button Exist");
		}
		else
		{
			System.out.println("Login and Clear Button Not Exist");
		}
		//------------------------STEP-2--------------------------------
		String UserName="qaplanet1";
		String Password="user1";
		
		//Login to Application
		objUN.clear();
		objUN.sendKeys(UserName);
		objPWD.clear();
		objPWD.sendKeys(Password);
		objLogin.click();
		
		//Verify OrangeHrm title
		if(obj.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM Displayed");
		}
		else
		{
			System.out.println("Failed to login");
		}
		
		//Get Welcome Qaplanet Text
		String WelTxt=obj.findElement(By.xpath("//ul[@id='option-menu']/li")).getText();
		if(WelTxt.equals("Welcome "+UserName))
		{
			System.out.println("Welcome " +UserName+ " Diplayed");
		}
		else
		{
			System.out.println("Welcome " +UserName+ " Not Diplayed");
		}	
			
		//Create reference object for Change Password and LogOut
		WebElement objCP=obj.findElement(By.linkText("Change Password"));
		WebElement objLogout=obj.findElement(By.linkText("Logout"));
		
		//Verify Change Password and Logout
		if(objCP.isDisplayed() && objLogout.isDisplayed())
		{
			System.out.println("Change Password and Logout Button Displayed");
		}
		else
		{
			System.out.println("Change Password and Logout Button not Displayed");
		}	
		
		//Switch To Frame
		obj.switchTo().defaultContent();
	    //click on Logout
	    objLogout.click();
	    //wait for Title
	    Thread.sleep(2000);
	    //Verify Home Page
	    if(obj.getTitle().equals("OrangeHRM - New Level of HR Management"))
	    {
	        System.out.println("Sign off sucessfull & Home Page displayed");
	    }
	    else
	    {
	        System.out.println("Failed to Signoff");
	        return;
	    }        
		obj.close();
		obj.quit();
	}
}




















