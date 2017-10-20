package com.java.ArrayEx;

import java.util.HashSet;

public class ArrayDuplicate {

	public static void main(String[] args) 
	{
		String[] strArr = {"one","two","three","four","four","two","five"};
		HashSet<String> unique = new HashSet<String>();

		for(String str:strArr)
		{
			if(unique.add(str))
			{
				System.out.println("Duplicate Entry is: "+str);
			}

		}

	}

}
