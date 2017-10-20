package com.java.abstractclass;
abstract class top
{
	abstract void login();
	void close1()
	{
		System.out.println("Inside Abstract Class Method");
	}
	
}
public class AbstractClassExample1 extends top
{
	void login()
	{
		System.out.println("Login Sucessfully");
	}

	public static void main(String[] args) 
	{
		AbstractClassExample1 obj=new AbstractClassExample1();
		obj.close1();
		
	}

}
