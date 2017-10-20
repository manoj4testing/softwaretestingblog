package com.java.arraylistEx;

import java.util.ArrayList;

public class ArraylistEx10 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add("Manoj");
		obj.add("Kumar");
		obj.add("Rana");
		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		obj1.add("AAA");
		obj1.add("BBB");
		obj1.addAll(obj);
		obj1.addAll(1, obj);
		System.out.println(obj1);
	}

}
