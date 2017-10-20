package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx3 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Manoj");
		obj.add("Kumar");
		obj.add("Rana");
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("-----------------------");
		for(String s:obj)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------------------");
		@SuppressWarnings("rawtypes")
		Iterator itr=obj.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
