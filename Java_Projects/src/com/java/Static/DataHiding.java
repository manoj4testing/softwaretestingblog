package com.java.Static;
class base
{
	static void test()
	{
		System.out.println("Base Class Executed");
	}
}
public class DataHiding extends base {
	
	static void test()
	{
		System.out.println("Sub Class Executed");
	}

	public static void main(String[] args) 
	{
		/*@SuppressWarnings("unused")
		base obj=new base();
		base.test();
		@SuppressWarnings("unused")
		DataHiding obj1=new DataHiding();
		DataHiding.test();*/
		@SuppressWarnings("unused")
		base obj2=new DataHiding();
		base.test(); //Here DataHiding Happens Parent Class Method Called
		

	}

}
