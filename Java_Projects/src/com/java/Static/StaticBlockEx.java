package com.java.Static;
class Staticsimple1
{
	static
	{
		System.out.println("Staticsimple1 Static Block");
	}
	Staticsimple1()
	{
		System.out.println("Staticsimple1 constructor Called");
	}
}
class Staticsimple2 extends Staticsimple1
{
	
	static
	{
		System.out.println("Staticsimple2 Static Block");
	}
	Staticsimple2()
	{
		super();
		System.out.println("Staticsimple2 Constructor Called");
	}
}
public class StaticBlockEx {

	static
	{
		System.out.println("Main Method Static Block");
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		StaticBlockEx obj=new StaticBlockEx();
		@SuppressWarnings("unused")
		Staticsimple2 obj1=new Staticsimple2();
		@SuppressWarnings("unused")
		Staticsimple1 obj2=new Staticsimple1();
	}

}
