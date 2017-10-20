package com.java.mix;

public class StringCompareWithoutFunction {

	public static void main(String[] args) 
	{
		String str1 = "Jack eats Apple";
		String str2 = "Jack eats Apple";

		//Converting String to Character array to compare
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		int f=0;
		
		// Find the length of each strings
		int len1=str1.length();
		int len2=str2.length();

		//Loop to compare every Character
		for(int x=0;x<len1;x++)
		{
			for(int y=0;y<len2;y++)
			{
				if(ch1[x]==ch2[x])
				{
					
				}
				else
				{
					f=1;
					break;// Mismatch found loop breaks
				}
			}
		}
		if(f==1)
		{
			System.out.println("String not equal");
		}
		else
		{
			System.out.println("String are equal");
		}
	}
}
