package com.java.PGM_friends;

import java.util.Scanner;

public class BitwiseOddEvenCheck {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Press [ Y / N ] to continue...");
		String value = sc.next();
		switch (value) {
		case "Y":
			while(value == "Y"){
				System.out.println("Enter a no: ");
				int n = sc.nextInt();
				if((n&1)==0){
					System.out.println("Even");
				}
				else{
					System.out.println("odd");
				}
			}	
				System.out.println("Press [ Y / N ] to continue...");
				value = sc.next();
		
		case "N":
			while (value=="N"){
				System.exit(0);
				break;
			}
		}
		
	}
}