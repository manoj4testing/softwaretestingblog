package com.java.mix;

public class ReverseStringArraySimple {

	public static void main(String[] args) 
	{
		String[] strDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday","Sunday"};
		int k=strDays.length;
		System.out.println(k);
		for(int i=k-1;i>=0;i--)
		{
			//System.out.println(i);
			System.out.println(strDays[i].toString());
		}
			

	}

}
