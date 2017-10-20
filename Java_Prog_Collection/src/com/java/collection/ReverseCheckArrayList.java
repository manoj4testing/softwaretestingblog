package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseCheckArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		List<Integer> list1 = new ArrayList<Integer>();
		//System.out.println(list1);
		for(int i=list.size()-1;i>=0;i--)
		{
			//Integer k=list.get(i);
			for(int j=0;j<=list.size()-1;j++)
			{
				//Integer l=list.get(j);
				//System.out.println(k);
				//System.out.println(l);
				if(list.get(i).equals(list.get(j)))
				{
					list1.add(list.get(j));
					break;
				}
			}
			
			
		}
		System.out.println(list);
		System.out.println(list1);
		if(list.equals(list1))
		{
			System.out.println("Palendrome");
		}
		else
			System.out.println("not Palendrome");
		
	}
}