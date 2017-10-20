package com.java.ArrayEx;
import java.util.ArrayList;

public class FindMissingNumberInArray 
{
	public static int position;
	public static int findDifference(ArrayList<Integer> list)
	{
		if(position==1)
		{
			return list.get(1)-list.get(2);
		}
		else{
			return list.get(0)-list.get(1);
		}
	}
	public static void main(String[] args)
	{
		// arrray values should be in acsending or descending order
		//0 means missing number
		// arrray should contains only one missing value
		Integer[] a={1,5,9,13,0};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:a)
		{
			list.add(i);
		}
		position=list.indexOf(new Integer(0));
		list.remove(new Integer(0));
		int diff = findDifference(list);
		int missingNumber=0;
		if(position==list.size())
		{
			missingNumber=list.get(position-1)-diff;
		}
		else
		{
			missingNumber=list.get(position)+diff;
		}
		list.add(position, missingNumber);
		System.out.println("missingNumber:"+missingNumber);
		for(Integer i:list)
			System.out.print(i+" ");
	}
}