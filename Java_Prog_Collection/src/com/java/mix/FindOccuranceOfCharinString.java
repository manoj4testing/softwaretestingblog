package com.java.mix;

import java.util.HashMap;

public class FindOccuranceOfCharinString 
{

	public static void main(String[] args) 
	{
		String str = "maaaaanoj Kumar Rana";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) 
		{
			if (map.containsKey(ch)) 
			{
				//System.out.println(map.entrySet());
				int val = map.get(ch);
				map.put(ch, val+1); //Override The Value Field
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);

	}
}