package com.java.constructor;

public class DefaultconstructorCallingVSStatic {
	
	DefaultconstructorCallingVSStatic()
	{
		System.out.println("Default Constructor Called");
	}
	static
	{
		System.out.println("Static Block Executed");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		DefaultconstructorCallingVSStatic obj=new DefaultconstructorCallingVSStatic();

	}

}
