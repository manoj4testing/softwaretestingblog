package com.java.Static;

public class StaticVar {
	static int var1=10;
	
	public StaticVar() 
	{
		var1++;
		System.out.println(var1);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		StaticVar obj=new StaticVar();
		StaticVar obj1=new StaticVar();
		

	}

}
