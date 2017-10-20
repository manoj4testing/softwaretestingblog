package com.java.basics;
public class FindNoOfDuplicateCharacter
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String s="i am monoj good boy";
		char c='o';
		
		int cou=s.length()-s.replace("o", "").length();
		
		System.out.println("Number of occurances of 'a' in= "+ cou);
	}
	
}
