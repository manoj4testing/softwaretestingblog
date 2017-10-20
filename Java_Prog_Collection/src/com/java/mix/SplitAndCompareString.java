package com.java.mix;

public class SplitAndCompareString 
{

	public static void main(String[] args) 
	{
		String str="I am Manoj";
		String[] li=str.split(" ");
		int size=li.length;
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			if(li[i].equalsIgnoreCase("i"))
			{
				System.out.println(li[i]);
			}
		}

	}

}
