package com.java.interviewFAQ;

public class FibonacciExample {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int n1=0,n2=1,n3,i=0,count=10;    
		System.out.println(n1);//printing 0 and 1
		System.out.println(n2);

/*		for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		} */  
		while(i<5)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
			System.out.println(n3);
		}

	}

}
