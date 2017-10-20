package com.java.string;

public class MyStringLineCounter {

	public static void main(String[] args) 
	{
		String str = "line1\nline2\nline3\rline4";
        System.out.println(str);
        int count = getLineCount(str);
        System.out.println("line count: "+count);

	}

	private static int getLineCount(String str) 
	{
		return str.split("[\n|\r]").length;
	}

}
