package com.java.mix;

import java.util.Enumeration;
import java.util.Hashtable;

public class Map_Hastable {

	public static void main(String[] args) 
	{
		Enumeration<String> names;
		String key;

		// Creating a Hashtable
		Hashtable<String, String> hashtable = 
				new Hashtable<String, String>();

		// Adding Key and Value pairs to Hashtable
		hashtable.put("Key1","Chaitanya");
		hashtable.put("Key2","Ajeet");
		hashtable.put("Key3","Peter");
		hashtable.put("Key4","Ricky");
		hashtable.put("Key5","Mona");

		names = hashtable.keys();
		while(names.hasMoreElements()) 
		{
			key = (String) names.nextElement();
			System.out.println("Key: " +key+ " & Value: " +	hashtable.get(key));
		}

	}

}