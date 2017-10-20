package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx5 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("India");
		obj.add("USA");
		obj.add("UAE");
		obj.add("ven");
		obj.add("switzerland");
		
		System.out.println("Reverse Order");
		Collections.reverse(obj);
		for(String str:obj)
		{
			System.out.println(str);
		}
		System.out.println("------------------");
		System.out.println("After Sorting");
		Collections.sort(obj);
		for(String str:obj)
		{
			System.out.println(str);
		}

	}

}
