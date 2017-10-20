package com.java.interviewPrograms;
import java.util.HashSet;

public class ArrayDuplicate
{ 
    public static void main(String a[])
    {
    	String[] strArr = {"one","two","three","four","four","two","five"};
	    HashSet<String> unique = new HashSet<String>();
	    
	    for(String str:strArr)
	    {
	      if(!unique.add(str))
	      {
	         System.out.println("Duplicate Entry is: "+str);
	      }
	      
	    }
	}
}
