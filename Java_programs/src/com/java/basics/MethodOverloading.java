package com.java.basics;
class base
{
	public void login()
	{
		System.out.println("Base Class Method Called");
	}
	public void login(int i)
	{
		System.out.println("Base Class Method int ");
		System.out.println("The Value Of I Is"+i);
	}
}
public class MethodOverloading extends base {

	public void login()
	{
		System.out.println("Child Class Method Called");
	}
	public void login(int k,int l)
	{
		System.out.println("Child Class Method Called");
		System.out.println("The Value Of j Is "+k+"  k Is "+l);
	}
	public static void main(String[] args) 
	{
		MethodOverloading obj=new MethodOverloading();
		obj.login();
		obj.login(15);
		obj.login(25,35);

	}

}
