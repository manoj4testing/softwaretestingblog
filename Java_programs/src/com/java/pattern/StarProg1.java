package com.java.pattern;
public class StarProg1
{
	public static void main(String[] args)
	{
		String s="abc";
		String s1=new String("abc");
		
		if(s.equals(s1))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("false");
		}
	}
}
