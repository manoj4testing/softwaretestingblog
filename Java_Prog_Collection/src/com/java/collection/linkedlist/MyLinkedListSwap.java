package com.java.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListSwap {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
         
        Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation:");
        for(String str: list)
        {
            System.out.println(str);
        }

	}

}
