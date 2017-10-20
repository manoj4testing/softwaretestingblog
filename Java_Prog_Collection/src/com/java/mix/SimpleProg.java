package com.java.mix;

public class SimpleProg {

	public static void main(String[] args) 
	{
		System.out.println("Find Current Thread");
		Thread t=Thread.currentThread();
		System.out.println("Current Thread:"+t);
		System.out.println("Its Name:"+t.getName());

	}

}
