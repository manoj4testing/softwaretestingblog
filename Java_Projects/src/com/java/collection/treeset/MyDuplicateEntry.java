package com.java.collection.treeset;

import java.util.TreeSet;

public class MyDuplicateEntry {

	public static void main(String[] args) 
	{
		String[] strArr = {"one","two","three","four","four","five"};
		TreeSet<String> unique = new TreeSet<String>();
		for(String str:strArr)
		{
			if(!unique.add(str))
			{
				System.out.println("Duplicate Entry is: "+str);
			}
		}

	}

}
