package com.java.interviewPrograms;
public class StringDigit
{
	public static void main(String[] args) 
	{
		String a = "m22n3j5";
		int sum = 0;
		for(int i = 0; i < a.length(); i++)
		{	
			if(Character.isDigit(a.charAt(i))) 
			{
				sum = sum + Integer.parseInt(a.charAt(i)+"");
			} 
		}
		System.out.println(sum);	
	}
}
