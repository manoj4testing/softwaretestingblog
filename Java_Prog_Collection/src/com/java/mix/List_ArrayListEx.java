package com.java.mix;

import java.util.ArrayList;

public class List_ArrayListEx {

	public static void main(String[] args) 
	{
		//declaring Arraylist of String objects  
		ArrayList<String> myList = new ArrayList<String>();  
		//Adding objects to Array List at default index  
		myList.add("Apple");  
		myList.add("Mango");  
		myList.add("Orange");  
		myList.add("Grapes");  
		//Adding object at specific index  
		myList.add(1, "Orange");  
		myList.add(2,"Pinapple");  
		System.out.println("Print All the Objects:");  
		for(String s:myList)
		{  
			System.out.println(s);  
		}  
		System.out.println("Object at index 3 element from list: "+ myList.get(3));  
		System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));  
		System.out.println("Size of ArrayList: " + myList.size());  
		myList.remove("Papaya");  
		System.out.println("New Size of ArrayList: "+ myList.size());  


	}

}
