package com.java.mix;

import java.util.Scanner;

public class RemoveVowelString {

	public static void main(String[] args) 
	{
		String strOrig, strNew;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String : ");
		strOrig = scan.nextLine();

		System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
		strNew = strOrig.replaceAll("[aeiouAEIOU]", "");

		System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");

		System.out.print(strNew);

	}

}
