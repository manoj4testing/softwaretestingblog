package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistEx2 {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>(Arrays.asList("Manoj","Kumar","Rana"));
		System.out.println(obj);
		
		
		@SuppressWarnings("serial")
		ArrayList<String> obj1=new ArrayList<String>()
				{{
					add("Manoj");
					add("Kumar");
					add("Rana");
					}};
					System.out.println(obj1);
	}

}
