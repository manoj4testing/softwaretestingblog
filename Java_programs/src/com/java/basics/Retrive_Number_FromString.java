package com.java.basics;

public class Retrive_Number_FromString {
	//Display only numeric numbers from a string
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		String s="Manoj123kumar";
		//String x=s.replaceAll("[^0-9]", "");
		//String x=s.replaceAll("\\D+", "");
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i); 
			if(c.isDigit(c))
			{
				System.out.println(c);
			}
		}
		//System.out.println(x);

	}

}
