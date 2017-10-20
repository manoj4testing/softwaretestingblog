package com.java.interviewPrograms;

public class MainMethodOverloading 
{
	public static void main(int a) 
	{
		System.out.println(a);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		System.out.println("Main method ");
		MainMethodOverloading obj=new MainMethodOverloading();
		obj.main(20);
	}
}
