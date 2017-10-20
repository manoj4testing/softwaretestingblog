package com.java.HashmapEx;

import java.util.HashMap;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		String str="manojkumarrana";
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
				
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(Character c:hm.keySet())
		{
			if(c>=2)
			{
				System.out.println(c+"--->"+hm.get(c));
			}
		}
		

	}

}
