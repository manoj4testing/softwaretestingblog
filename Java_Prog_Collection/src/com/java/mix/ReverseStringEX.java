package com.java.mix;

public class ReverseStringEX {

	public static void main(String[] args)
	{
		String str="Manoj";
		char[] a=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
