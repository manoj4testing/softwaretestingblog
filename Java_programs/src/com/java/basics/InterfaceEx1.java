package com.java.basics;
interface ex1
{
	/* All the methods are public abstract by default
       Note down that these methods are not having body */
    
	public void m1();
	public void m2();
}
class InterfaceEx1 implements ex1
{
	public void m1()
	{
		System.out.println("method1");
	}
	public void m2()
	{
		System.out.println("method2");
	}
	public static void main(String[] args) 
	{
		ex1 obj=new InterfaceEx1();
		obj.m1();
		obj.m2();
		
	}

}
