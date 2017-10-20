package com.java.StringEX;

public class StringbuilderEX {

	public static void main(String[] args)
	{
		String a="Manoj Kumar Rana";
		String[] b=a.split(" ");
		b[1]=new StringBuffer(b[1]).reverse().toString();
		//System.out.println(b[1]);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
