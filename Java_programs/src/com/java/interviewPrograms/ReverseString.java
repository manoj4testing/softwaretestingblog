package com.java.interviewPrograms;
import java.util.Scanner;
public class ReverseString
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		String orginal,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:-");
		orginal=in.nextLine();
		int l=orginal.length();
		//System.out.println(l);
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+orginal.charAt(i);
		}
		//System.out.println("Reverse of entered string is: "+reverse);
		/*StringBuffer s=new StringBuffer("monoj");
		System.out.println(s.reverse());
		*/
		if(orginal.equals(reverse))
		{
			System.out.println("Given string palindrome:-"+reverse);
		}
		else
		{
			System.out.println("Given string not a palindrome:-"+reverse);
		}
	}
}
