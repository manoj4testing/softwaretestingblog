package com.java.StringEX;

public class StringCompare {

	public static void main(String[] args)
	{
		String s="manoj";
		String obj=new String("manoj");
		boolean result=s.equals(obj);
		if(result)
		{
			System.out.println("Values Matched");
			System.out.println(s.hashCode());
			System.out.println(obj.hashCode());
		}
		else
		{
			System.out.println("Values Not Matched");
		}

	}

}
