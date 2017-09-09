package com.java.string;

public class MyStringEquals {

	public static void main(String[] args) 
	{
		String x = "JUNK";
        String y = "junk";
        /**
         * We cannot use '==' operator to compare two strings.
         * We have to use equals() method.
         */
        if(x.equals(y))
        {
            System.out.println("Both strings are equal.");
        } 
        else
        {
            System.out.println("Both strings are not equal.");
        }
        /**
         * We can ignore case with equalsIgnoreCase() method
         */
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("Both strings are equal.");
        } 
        else
        {
            System.out.println("Both strings are not equal.");
        }

	}

}
