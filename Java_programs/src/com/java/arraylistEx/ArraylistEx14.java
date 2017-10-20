package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx14 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Manoj");
		al.add("Kumar");
		al.add("Rana");
		
		System.out.println("Before Swap");
		for (Object str : al) 
		{
			System.out.println(str);
		}
		System.out.println("--------------------------");
		Collections.swap(al, 0, 1);
		System.out.println("After Swap");
		for (Object str : al) 
		{
			System.out.println(str);
		}

	}

}
