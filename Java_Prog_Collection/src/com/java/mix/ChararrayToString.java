package com.java.mix;

public class ChararrayToString {

	public static void main(String[] args) 
	{
		//char array
		char[] charArray = new char[]{'J','a','v','a'};

		/*
		 * To convert char array to String in Java, use
		 * String(Char[] ch) constructor of Java String class.
		 */

		String str = new String(charArray);

		System.out.println("Char array converted to String: " + str);

	}

}
