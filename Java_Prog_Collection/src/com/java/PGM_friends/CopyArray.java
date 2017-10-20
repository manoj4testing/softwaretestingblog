package com.java.PGM_friends;

public class CopyArray {
	

	public static void main(String[] args) {
		int ar1[] = {10,20,30};		
		int ar2[] = {40,50,60};
		System.arraycopy(ar1, 0, ar2, 5, ar2.length);
		
		
	}
}