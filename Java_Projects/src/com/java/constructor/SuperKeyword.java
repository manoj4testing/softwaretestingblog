package com.java.constructor;

class base
{
	base()
	{
		System.out.println("Base Class Default Constructor Is Called");
	}
	base(int i)
	{
		super();
		System.out.println("Parameterized Constructor Called");
	}
}
public class SuperKeyword extends base 
{
	
	SuperKeyword() 
	{
		super(5);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		/*@SuppressWarnings("unused")
		base obj=new base(5);*/
		SuperKeyword obj=new SuperKeyword();
		
		System.out.println("Main Ends Here");
	}

}
