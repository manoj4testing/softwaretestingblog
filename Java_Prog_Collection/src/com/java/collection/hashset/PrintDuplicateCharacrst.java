package com.java.collection.hashset;

import java.util.HashSet;

public class PrintDuplicateCharacrst {

	public static void main(String[] args) 
	{
		int [] dup={1,2,3,2};
		HashSet<Integer> uniq=new HashSet<Integer>();
		for(Integer x:dup)
		{
			if(uniq.add(x))
			{
				//System.out.println("Duplicate Entry is " +x);
				continue;
			}
			else
			{
				System.out.println("Duplicate Entry is " +x);
			}
		}

	}

}
