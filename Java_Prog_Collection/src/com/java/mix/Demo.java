package com.java.mix;

public class Demo {

	public static void main(String[] args) 
	{
		String str="Manoj Kumar Rana";
		char[] str1=str.toCharArray();
		Integer len=str1.length;
		for(int i=len-1;i>=0;i--)
			System.out.println(str1[i]);
			//System.out.println(str1[0]);

	}

}
