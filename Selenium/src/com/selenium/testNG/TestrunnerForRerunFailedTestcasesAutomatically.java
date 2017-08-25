package com.selenium.testNG;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;


public class TestrunnerForRerunFailedTestcasesAutomatically {

	public static void main(String[] args) 
	{
		TestNG runner=new TestNG();
		List<String> list=new ArrayList<String>();
		list.add("G:\\Base_Workspace\\Neon\\Selenium\\test-output\\rerunfailed\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
