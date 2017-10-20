package com.java.interviewPrograms;
import java.io.BufferedReader;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringSort 
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter a String");
		str=s.readLine();
		char [] charArry=str.toCharArray();
		Arrays.sort(charArry);
		String nstr=new String(charArry);
		System.out.println("The sorted String is:-" +nstr);		
	}
}
