package com.java.collection.stringtokenizer;

import java.util.StringTokenizer;

public class MyTokenCount {

	public static void main(String[] args) 
	{
		String msg = "This program gives sample code for String Tokenizer"; 
		StringTokenizer st = new StringTokenizer(msg," "); 
		System.out.println("Count: "+st.countTokens());

	}

}
