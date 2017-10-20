package com.java.mix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args) 
	{
		
			System.out.print("Enter string to analyse:");
			Scanner sn = new Scanner(System.in);
			String input = sn.nextLine();

			// first let us split string into words
			String[] words = input.split(" ");

			// adds all words into a map
			// we also check whether the word is already in map!
			Map<String,Integer> wordMap = new HashMap<String,Integer>();
			for(int i=0;i<input.length();i++) {
				String word = input.charAt(i)+""; // for case insensitive comparison
				if(wordMap.get(word)!=null) {
					// we found a duplicated word!
					wordMap.put(word, wordMap.get(word)+1);

				}else {
					wordMap.put(word, 1);
				}

			}
			System.out.println(wordMap);
		}   
	}

