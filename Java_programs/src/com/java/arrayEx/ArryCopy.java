package com.java.arrayEx;

public class ArryCopy
{
	public static void main(String arg[])
	{
		char  a[]={'a','b','c','d','e','f'};
		char [] b=new char[3];
		
		System.arraycopy(a, 1, b, 0,3);
		System.out.println("New String b=" + new String(b));
	}
}
