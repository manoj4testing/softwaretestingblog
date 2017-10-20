package com.java.arraylistEx;

import java.util.ArrayList;

public class ArrayListWithDifferentData {

	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("a");
		al.add("B");
		al.add(new String("c"));
		al.add(new Student("Manoj",34));
		int a[]={1,2,3,4,5};
		for(int i:a)
		{
			System.out.println(i);
		}
		for(Object ab:al)
		{
			System.out.println(ab);
		}

	}

}
