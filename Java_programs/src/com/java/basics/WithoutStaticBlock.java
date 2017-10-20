package com.java.basics;
class av
{
	void login()
	{
		System.out.println("Login Method Of AV");
	}
}
class bv extends av
{
	void login()
	{
		System.out.println("Login Method Of BV Class");
	}
}
public class WithoutStaticBlock {

	public static void main(String[] args) 
	{
		av obj=new bv();
		obj.login();

	}

}
