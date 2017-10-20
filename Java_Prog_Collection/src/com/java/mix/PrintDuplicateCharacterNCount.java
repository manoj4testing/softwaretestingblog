package com.java.mix;

import java.util.HashMap;

public class PrintDuplicateCharacterNCount {

	public static void main(String[] args) 
	{
		String str1 = "Monocept mukarrana";
		String str=str1.toLowerCase();
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();  
		for (int i = 0; i < str.length(); i++)
		{  
			char c = str.charAt(i);  

			if (charCountMap.containsKey(c))
			{  
				charCountMap.put(c, charCountMap.get(c) + 1); 
			}
			else
			{  
				charCountMap.put(c, 1);  
			}  

		}  
		for (Character c : charCountMap.keySet())
		{  
			if (charCountMap.get(c) >= 2)  
				System.out.println("duplicate character : " + c + " ====== " + " count : " + charCountMap.get(c));

		}
	}

}
