package com.selenium.basics;

public class Demo123 implements TesFunc {
	int x = 3;
	int y = 5;

	public void getTestMethod() 
	{
		System.out.println("in the getTestMethod() Demo123 class");
	}
	public void getTest2Method() 
	{
		System.out.println("In the getTest2Method() Demo123 class");
	}
	public void testMethod(TesFunc func) 
	{
		System.out.println("executed");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Demo123 demo123 = new Demo123();
		TesFunc func = new abc();
		TesFunc func2 = new Demo123();
		abc abc = new abc();
		demo123.testMethod(demo123);
		demo123.testMethod(abc);
		demo123.getTest2Method();
		demo123.getTest2Method();
	}
}

class abc implements TesFunc {
	public void getTestMethod() {
		System.out.println("in the getTestMethod() abc class");
	}

	public void getTest2Method() {
		System.out.println("In the getTest2Method() abc class");
	}
}