package com.java.mix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElements 
{

	public static void main(String[] args) 
	{
		List<String>  arraylist = new ArrayList<String>();
	    
	    arraylist.add("instanceofjava");
	    arraylist.add("Interview Questions");
	    arraylist.add("Interview Programs");
	    arraylist.add("java");
	    arraylist.add("Collections Interview Questions");
	    arraylist.add("instanceofjava");
	    arraylist.add("Java Experience Interview Questions");
	    
	    
	    System.out.println("Before Removing duplicate elements:"+arraylist);
	    HashSet<String> hashset = new HashSet<String>();
	    
	    /* Adding ArrayList elements to the HashSet
	     * in order to remove the duplicate elements and 
	     * to preserve the insertion order.
	     */
	    hashset.addAll(arraylist);
	 
	    // Removing ArrayList elements
	    arraylist.clear();
	 
	    // Adding LinkedHashSet elements to the ArrayList
	    arraylist.addAll(hashset );
	 
	    System.out.println("After Removing duplicate elements:"+arraylist);
	 
	}

	}


