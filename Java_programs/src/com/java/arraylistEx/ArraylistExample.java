package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {

	public static void main(String[] args)
	{
		List<String> li=new ArrayList<String>();
		li.add("Manoj");
		li.add("Kumar");
		li.add("Rana");
		li.add("Manoj");
		//System.out.println(li.toString());
		int size=li.size();
		System.out.println("Total No Of Elements:-"+size);
		for(String s:li)
		{
			System.out.println(s);
		}

	}

}
