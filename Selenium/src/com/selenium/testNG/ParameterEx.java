package com.selenium.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx 
{
	@Test
	@Parameters("myName") //This Values Comes From The Respective XML File
	//This Program Should Be Run From XML Not Here
	public void parameterTest(String myName) {
		System.out.println("Parameterized value is : " + myName);
	}
}
