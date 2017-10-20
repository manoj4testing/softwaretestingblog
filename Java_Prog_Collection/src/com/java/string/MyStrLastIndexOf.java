package com.java.string;

public class MyStrLastIndexOf {

	public static void main(String[] args) 
	{
		String str = "Use this string for testing this";
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 's' at last occurance: "+str.lastIndexOf('s'));
        System.out.println("String \"this\" at last occurance: "+str.lastIndexOf("this"));
        /**
         * Returns the last occurance from specified start index,
         * searching backward starting at the specified index.
         */
        System.out.println("first occurance of char 's' from 24th index backwards: "
                            +str.lastIndexOf('s',24));
        System.out.println("First occurance of String \"this\" from 26th index backwards: "
                            +str.lastIndexOf("this",26));

	}

}
