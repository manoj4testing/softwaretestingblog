package com.java.PGM_friends;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CountCharacter {

	private int a;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("hello");
		
		 String m="monojo";
		 
		 char[] ch1=m.toCharArray();
		 int count=0;
		 
		 String h="";
		 
		 char[] ch3=m.toCharArray();
         for(Character ch2:ch1)
         {
        	for(Character ch4:ch3)
        	{
        		if(ch2.equals(ch4))
        		{
        		count++;
        		
        		}
        		
        	}
        	 
         }
         if(count>m.length())
         {
        	 System.out.println("num of repeated values"+(m.length()-count));
         }
				
	}
}