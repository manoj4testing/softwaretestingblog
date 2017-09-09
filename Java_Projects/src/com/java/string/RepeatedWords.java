package com.java.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWords {

	public static void main(String[] args) 
	{
		String sentence = "java is java";
		System.out.println("U have entered: "+sentence);
		String[] word = sentence.split(" ");
	
		System.out.println("Separated by words---->");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String wordCount : word) {
			if (map.containsKey(wordCount.toLowerCase())) {
				map.put(wordCount.toLowerCase(),map.get(wordCount.toLowerCase()) );
			}
			else
			{
				map.put(wordCount.toLowerCase(), 1);
			}
			//System.out.println("\t"+wordCount);
		}
		Set<String> set = map.keySet();
		for (String wordCount : set) {
			if (map.get(wordCount)>1) {
				
				System.out.println(wordCount+"\t"+map.get(wordCount));
			}
		} 

	}

}
