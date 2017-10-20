package com.java.arraylistEx;

import java.util.ArrayList;

public class ArraylistEx9 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
		obj.add("Manoj");
		obj.add("Kumar");
		obj.add("Rana");
		obj.add("234");
		obj.set(2, "aaaa");
		obj.add(3, "Manoj Kumar");
		System.out.println(obj);

	}

}
