package com.java.PGM_friends;

public class CountCharFromWord {

	public static void main(String[] args) {
		String s1 = "This is world of java ";
		String[] word = s1.split(" ");
			
		System.out.println("Separated words: "+word.length);
		char ch[];
		System.out.println("Number of characters present in each word:");
		for (int i = 0; i < word.length-1; i++) {
			ch=word[i].toCharArray();
			System.out.println(word[i]+"\t-->"+ch.length);
		}
	}

}