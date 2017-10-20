package com.java.interviewFAQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) 
	{
		// A string array with duplicate values
		String[] data = { "E", "C", "B", "E", "A", "B", "E", "D", "B", "A" };

		System.out.println("Original array         : " + Arrays.toString(data));

		List<String> list = Arrays.asList(data);
		System.out.println(list.size());
		Set<String> set = new HashSet<String>(list);

		System.out.print("After removing duplicates: ");
		System.out.println(set.size());
		String[] resarray= new String[set.size()];
		set.toArray(resarray);

		for (String ele: resarray) {

			System.out.print(ele + ", ");

		}


	}

}
