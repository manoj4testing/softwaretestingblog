package com.java.constructor;

public class ParameterizedConstructorWithThis 
{

	ParameterizedConstructorWithThis()
	{
		this(5,"Hi"); // This Should Be The First Statement
		System.out.println("Inside Default Constructor");
		
	}
	ParameterizedConstructorWithThis(int i,String ch)
	{
		System.out.println("inside Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		ParameterizedConstructorWithThis obj=new ParameterizedConstructorWithThis();
		@SuppressWarnings("unused")
		ParameterizedConstructorWithThis obj1=new ParameterizedConstructorWithThis(5,"Manoj");

	}

}
