package com.selenium.testNG;

import org.testng.annotations.Factory;

public class FactoryInvoker 
{
	@Factory
	public Object[] invokerfactory()
	{
		Object[] obj=new Object[5];
		obj[0]=new FactoryExample();
		obj[1]=new FactoryExample();
		obj[2]=new Demo();
		obj[3]=new FactoryExample();
		obj[4]=new FactoryExample();
		return obj;
		
	}
	

}
