package com.java.constructor;

public class ParameterizedConstructor 
{

	ParameterizedConstructor()
	{
		System.out.println("Inside Default Constructor");
		
	}
	ParameterizedConstructor(int i,String ch)
	{
		System.out.println("inside Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ParameterizedConstructor obj=new ParameterizedConstructor();
		@SuppressWarnings("unused")
		ParameterizedConstructor obj1=new ParameterizedConstructor(5,"Manoj");

	}

}
