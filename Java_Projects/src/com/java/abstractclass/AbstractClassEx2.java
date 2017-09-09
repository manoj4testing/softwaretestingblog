package com.java.abstractclass;
abstract class abstractparent
{
	abstractparent()
	{
		System.out.println("Constructor Called");
	}
}
public class AbstractClassEx2 extends abstractparent
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		AbstractClassEx2 obj=new AbstractClassEx2();
		

	}

}
