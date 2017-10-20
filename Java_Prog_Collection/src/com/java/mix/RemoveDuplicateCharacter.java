package com.java.mix;

import java.util.HashSet;

public class RemoveDuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String s="Manoja";
		//char[] chars = s.toCharArray();
	    HashSet<Character> charz = new HashSet<Character>();

	    for(Character c : s.toCharArray() )
	    {
	    	//System.out.println(c);
	        if(charz.contains(c))
	        {
	           //charz.add(c);
	           System.out.print(c+"---");
	        }
	        else
	        	charz.add(c);
	    }

	    for(Character c : charz)
	    {
	        System.out.print(c);
	    }

	}

}
