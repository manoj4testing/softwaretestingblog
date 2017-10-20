package com.java.basics;

public class Hi 
{

	public void abc(ThisUse t)
	{
		t.disp();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		Hi obj=new Hi();
		obj.abc(new ThisUse());
		
		

	}

}
