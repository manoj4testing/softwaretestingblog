package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx4 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("India");
		obj.add("Pakistan");
		obj.add("England");
		obj.add("USA");
		
		System.out.println("Before Sorting");
		System.out.println("--------------------");
		for(String str:obj)
		{
			System.out.println(str);
		}
		System.out.println("--------------------");
		System.out.println("After Sorting");
		System.out.println("--------------------");
		Collections.sort(obj);
		for(String str:obj)
		{
			System.out.println(str);
		}
	}

}
