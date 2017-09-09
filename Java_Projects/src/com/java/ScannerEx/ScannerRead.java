package com.java.ScannerEx;

import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: -");
		String name=sc.nextLine();
		System.out.println("Enter Age: -");
		int age=sc.nextInt();
		System.out.println("Entered Name Is - "+name);
		System.out.println("Entered Age Is"+ age);
	}

}
