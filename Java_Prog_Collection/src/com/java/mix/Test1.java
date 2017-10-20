package com.java.mix;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 
{	

	public static void main(String[] args) 
	{
		String S = "Folloowwwuupp";
		int L = S.length();
		for(char i='a'; i<='z'; i++)
		{
		int count = 0;
		for(int j=0; j<L; j++)
		{
		char ch=S.charAt(j);
		if(ch==i) 
		count++; 
		}
		if(count>=1)
		{
		System.out.println(i+": "+count);
		}
		}
	}
}