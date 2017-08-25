package com.selenium.mix;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Desktop_App1 {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		// TODO Auto-generated method stub
		Screen s=new Screen();
		Pattern p=new Pattern("G:\\Sikuliimages\\Computer.JPG");
		//s.click(p);
		s.doubleClick(p);
		Thread.sleep(3000);
		Pattern p1=new Pattern("G:\\Sikuliimages\\Drive.JPG");
		s.doubleClick(p1);
		

	}

}
