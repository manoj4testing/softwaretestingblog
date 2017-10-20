package com.java.mix;

public class String_StringtoCharArray_ {

	public static void main(String[] args) 
	{
		 //declare the original String object
	    String strOrig = "Hello World";
	    //declare the char array
	    char[] stringArray;
	   
	    //convert string into array using toCharArray() method of string class
	    stringArray = strOrig.toCharArray();
	   
	    //display the array
	    for(int index=0; index < stringArray.length; index++)
	      System.out.println(stringArray[index]);

	}

}
