package com.java.mix;

public class StringTrim {

	public static void main(String[] args) 
	{
		String str = "   String Trim Example   ";
        
        /*
         * To remove leading and trailing space from string use,
         * public String trim() method of Java String class.
         */
         
         String strTrimmed = str.trim();
         
         System.out.println("Original String is: " + str);
         System.out.println("Removed Leading and trailing space");
         System.out.println("New String is: " + strTrimmed);

	}

}
