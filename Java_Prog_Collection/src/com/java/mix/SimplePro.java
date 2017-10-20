package com.java.mix;

public class SimplePro {
	static int x;
	static int y;
	SimplePro(String name)
	{
		System.out.println("Hi   "+name);
	}

	/*public SimplePro(int a, int b) 
	{
		x=a;y=b;
	}*/

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		int a,b,sum;
		//SimplePro obj=new SimplePro(6,7);
		x=7;y=6;
		sum=x+y;
		System.out.println(sum);
		

	}

}
