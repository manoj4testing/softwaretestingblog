package com.java.interviewPrograms;
class  A 
{
	public  void disp()
	{
		@SuppressWarnings("unused")
		A obj=new A();
		System.out.println("monoj");
	}
}
public class Demo234567 extends A
{
	
	public static void main(String[] args) 
	{
		Demo234567 obj=new Demo234567();
		obj.disp();
	}
}

