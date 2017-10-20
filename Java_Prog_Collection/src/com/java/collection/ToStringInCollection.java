package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ToStringInCollection 
{

	public static void main(String[] args) 
	{
		List<String> li=new ArrayList<String>();
		li.add("Manoj");
		li.add("Kumar");
		li.add("Rana");
		System.out.println(li); // tostring is bydefault override in collection

	}

}
