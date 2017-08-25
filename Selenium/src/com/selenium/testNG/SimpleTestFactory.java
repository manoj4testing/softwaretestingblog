package com.selenium.testNG;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
	@Factory
    public Object[] factoryMethod() 
    {
        Object[] obj=new Object[5];
        obj[0]=new SimpleTest1();
        obj[1]=new SimpleTest2();
        obj[2]=new SimpleTest1();
        obj[3]=new SimpleTest1();
        obj[4]=new SimpleTest1();
		return obj;
        
    }

}
