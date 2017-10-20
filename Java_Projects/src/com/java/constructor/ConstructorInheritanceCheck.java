package com.java.constructor;
class a
{
	a()
	{
		System.out.println("Super Class Constructor Called");
	}
}

public class ConstructorInheritanceCheck extends a
{
	ConstructorInheritanceCheck()
	{
		System.out.println("Sub Class Constructor");
	}
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("unused")
		ConstructorInheritanceCheck obj=new ConstructorInheritanceCheck();
		
	}

}
