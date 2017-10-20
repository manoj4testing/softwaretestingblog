package com.java.mix;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNo {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter minimum number");
		int minimum=in.nextInt();

		System.out.println("Enter maximum number");
		int maximum=in.nextInt();

		Random rn = new Random();
		int range = maximum - minimum + 1;
		int randomNum =  rn.nextInt(range) + minimum;

		System.out.println("Random Number= "+randomNum);

	}

}
