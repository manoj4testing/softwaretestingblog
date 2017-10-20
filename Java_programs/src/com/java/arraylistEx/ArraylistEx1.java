package com.java.arraylistEx;

import java.util.ArrayList;

public class ArraylistEx1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Manoj");
		obj.add(12);
		obj.add('c');
		System.out.println(obj);
		
		obj.set(2, "Manoj Kumar");
		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);

	}

}
