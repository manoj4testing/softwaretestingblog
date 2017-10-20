package com.java.mix;

public class demo1 
{
	public static void main(String[] args) 
	{
		String x="Manoj";int len=x.length();
		String rev="";
		char[] y=x.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+y[i];
		}
		System.out.println(rev);
		
	}
}
