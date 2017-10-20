package com.java.interviewFAQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DuplicateCharInString 
{
	public void findDuplicateChars(String str)
	{
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
		char[] chrs = str.toCharArray(); 
		for(Character ch:chrs)
		{
			if(dupMap.containsKey(ch))
			{
				dupMap.put(ch, dupMap.get(ch)+1); 
			}
			else
			{
				dupMap.put(ch, 1); 
			}
		} 
		for(Character ch:dupMap.keySet())
		{
			if(dupMap.get(ch) > 1)
			{ 
				System.out.println(ch+"--->"+dupMap.get(ch));
				//System.out.println(dupMap);
			}
		}
	}
	public static void main(String a[])
	{
		DuplicateCharInString dcs = new DuplicateCharInString();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String Or Sentence");
		String str=sc.nextLine();
		dcs.findDuplicateChars(str);
	}

}
