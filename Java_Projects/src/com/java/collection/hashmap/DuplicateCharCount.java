package com.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharCount 
{
	public void DuplicateCharactersCount(String str)
	{
		Map<Character, Integer> dupmap=new HashMap<Character, Integer>();
		char [] chrs=str.toCharArray();
		for (char ch : chrs) 
		{
			if(dupmap.containsKey(ch))
			{
				dupmap.put(ch, dupmap.get(ch)+1);
			}
			else
			{
				dupmap.put(ch, 1);
			}
		}
		Set<Character> keys=dupmap.keySet();
		for (Character k : keys) 
		{
			if(dupmap.get(k)>1)
			{
				System.out.println(k+"--->"+dupmap.get(k));
			}
		}
	}
	public static void main(String[] args) 
	{
		String s;
		DuplicateCharCount obj=new DuplicateCharCount();
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:-");
		s=in.nextLine();
		obj.DuplicateCharactersCount(s);
	}

}
