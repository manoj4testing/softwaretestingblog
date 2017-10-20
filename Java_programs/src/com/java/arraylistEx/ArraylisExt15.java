package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylisExt15 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		LinkedList obj=new LinkedList();
		obj.add("Manoj");
		obj.add("Kumar");
		obj.add("Rana");
		
		List<String> li=new ArrayList<String>(obj);
		System.out.println(li);
	}

}
