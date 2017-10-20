package com.java.mix;
public class jygk
{
	int a;
	static int b=9;
	
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
	}
	static void m2()
	{	
		jygk obj=new jygk();
		obj.a=20;
		System.out.println(obj.a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		jygk obj1=new jygk();
		obj1.m1();
		m2();
	}

}
