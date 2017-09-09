package com.java.ArrayEx;

public class ArrayCopy1 {

	public static void main(String[] args) 
	{
		char ch[] = {'M','y',' ','N','a','m','e',' ','M','o','n','o','j'};
        String chStr = String.copyValueOf(ch);
        System.out.println(chStr);
        String subStr = String.copyValueOf(ch,3,10);
        System.out.println(subStr);

	}

}
