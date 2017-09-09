package com.java.collection.hashset;

import java.util.HashSet;

public class MyHashSetClear {

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("My HashSet content:");
        System.out.println(hs);
        System.out.println("Clearing HashSet:");
        hs.clear();
        System.out.println("Content After clear:");
        System.out.println(hs);

	}

}
