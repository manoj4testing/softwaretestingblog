package com.java.mix;

public class ReverseStringWothoutFun 
{

	public static void main(String[] args) 
	{
		String str="Manoj Kumar Rana";
		char[] a=str.toCharArray();
		int len=str.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			//System.out.println(i);
			System.out.println(a[i]);
			//System.out.println(i);
		}
		
		
	}

}
