package com.java.PGM_friends;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] s = {10,22,8,15,5};

		Arrays.sort(s);
		
		//display sorted array using for loop
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//displaying sorted array using toString() of Arrays class
		System.out.println(Arrays.toString(s));
	}
}