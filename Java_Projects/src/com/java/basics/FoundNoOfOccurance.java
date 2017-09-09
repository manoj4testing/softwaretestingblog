package com.java.basics;

public class FoundNoOfOccurance {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String s="i am monoj good boy";
		char c='o';
		int total_size=s.length();
		int replace_sie=s.replace("o", "").length();
		System.out.println(total_size +"\t"+replace_sie);
		int cou=s.length()-s.replace("o", "").length();
		
		System.out.println("Number of occurances of 'a' in= "+ cou);

	}

}
