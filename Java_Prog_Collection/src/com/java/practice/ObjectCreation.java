package com.java.practice;
class a
{
	int a,b;
	void m1()
	{
		System.out.println("Value Of a -- " +a);
		System.out.println("Value Of b -- " +b);
	}
}
public class ObjectCreation {

	public static void main(String[] args) 
	{
		System.out.println("======Main Starts Here=====");
		a obj=new a();
		obj.a=20;
		obj.b=40;
		obj.m1();
		System.out.println("=========================");
		a obj1=new a();
		obj1.a=30;
		//obj1.b=50;
		obj1.m1();
		System.out.println("====== Main Ends Here ========");

	}

}
