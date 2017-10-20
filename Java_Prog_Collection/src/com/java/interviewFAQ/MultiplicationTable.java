package com.java.interviewFAQ;

public class MultiplicationTable {

	static void multi(int n,int range)
	{
		for(int i=1;i<=range;i++)
		{
			System.out.println(n +"*" + i +"=" +(n*i));
		}
	}
	public static void main(String[] args) 
	{
		multi(5,10);

	}

}
