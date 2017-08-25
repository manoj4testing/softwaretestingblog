package com.selenium.basics;

public class examp 
{
	public void add(int x,Integer y)
	{
		System.out.println("1st method");
	}
	
	public void add(Double x,Integer y)
	{
		System.out.println("2nd method");
	}
	
	public static void main(String[] args) 
	{
		examp obj=new examp();
		obj.add(10, 20);
		obj.add(10.0, 30);
	}
}
