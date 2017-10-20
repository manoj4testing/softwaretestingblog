package com.java.interfaceExample;

public class InterfaceImplements1 implements InterfaceExBase {

	public void open()
	{
		System.out.println("Open Method Executed");
	}
	public void close()
	{
		System.out.println("Close Method Executed");
	}
	public static void main(String[] args)
	{
		InterfaceImplements1 obj=new InterfaceImplements1();
		obj.open();
		obj.close();
	}

}
