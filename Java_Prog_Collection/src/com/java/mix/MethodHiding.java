package com.java.mix;

class a
{
	public static void m1()
	{
		System.out.println("Ur Inside A");
	}
	public void m2()
	{
		System.out.println("inside m2");
	}
	}
public class MethodHiding  extends a
{
	public static void m1()
	{
		System.out.println("Ur Inside Main Methods");
	}
	public void m2()
	{
		System.out.println("inside main child");
	}

	public static void main(String[] args) 
	{
		MethodHiding obj=new MethodHiding();
		obj.m1(); // child methods call
		a obj1=new a();
		obj1.m1(); // Parent methods call
		a obj2=new MethodHiding();
		obj2.m1();// Parent methods call
		obj2.m2();

	}

}
