package com.java.inheritance;

class superclass
{
	public void show()
	{
		System.out.println("Parent Class");
	}
}
public class Subclass extends superclass
{
	Subclass()
	{
		super.show();
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Subclass obj=new Subclass();
		
	}
}

