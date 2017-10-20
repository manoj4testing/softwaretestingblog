package com.java.mix;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList names = new ArrayList();
		names.add("Chaitanya");
		names.add("Steve");
		names.add("Jack");

		Iterator it = names.iterator();

		while(it.hasNext()) 
		{
			String obj = (String)it.next();
			System.out.println(obj);
		}

	}

}
