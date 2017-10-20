package com.java.string;

public class MyStrSplit {

	public static void main(String[] args) 
	{
		String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
        /*for(String s:tokens)
        {
            System.out.println(s);
        }*/
        
        for(int i=0;i<tokens.length;i++)
        {
        	System.out.println(tokens[i]);
        }

	}

}
