package com.java.Hashcode;

public class HashcodeCompareEx {
	
	HashcodeCompareEx(String j)
	{
		
	}

	public static void main(String[] args) 
	{
		String s="Manoj";
		String m="Manoj";
		System.out.println(s.hashCode());
		System.out.println(m.hashCode());
		
		HashcodeCompareEx obj=new HashcodeCompareEx("M");
		HashcodeCompareEx obj1=new HashcodeCompareEx("M");
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
