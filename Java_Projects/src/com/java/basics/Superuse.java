package com.java.basics;
class base
{
	base()
	{
		System.out.println("Base Class Constructor Is Called");
	}
	base(int i)
	{
		System.out.println("The Value Of I Is : -"+i);
	}
	void display()
	{
		System.out.println("Display Method Of Base Class Called");
	}
}

public class Superuse extends base
{
	Superuse()
	{
		super(6);
		//super(); //constructor should be the first statement
		System.out.println("Child Class Constructor Is Called");
		super.display();
		
	}
	
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		Superuse obj=new Superuse();
	}

}
