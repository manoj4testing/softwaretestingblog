package com.java.PGM_friends;

import java.util.Arrays;

public class ArrayEqualityCheck {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[10];
		System.out.println(Arrays.equals(a, b));
		
		//checking equality of 2d array
		int a2d[][] = new int[2][];
		int b2d[][] = new int[2][];
		System.out.println(Arrays.deepEquals(a2d, b2d));
		
	}

}
