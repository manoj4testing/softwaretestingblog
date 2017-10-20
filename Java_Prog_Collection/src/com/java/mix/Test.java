package com.java.mix;

public class Test {

	public static void main(String[] args) 
	{
		int no=153;int fno=0;
		while(no!=0)
		{
			int rem=no%10;
			fno=fno+rem;
			no=no/10;
			
		}
		System.out.println(fno);
	}

}
