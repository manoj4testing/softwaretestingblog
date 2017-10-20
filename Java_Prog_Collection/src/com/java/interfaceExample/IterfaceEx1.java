package com.java.interfaceExample;
interface A
{
	public void m1();
}
interface B
{
	public void m1();
}
public class IterfaceEx1 
{

	public void m1() 
	{
		System.out.println("interface");
	}
	public static void main(String[] args) 
	{	
		IterfaceEx1 obj=new IterfaceEx1();
		obj.m1();
	}

}
