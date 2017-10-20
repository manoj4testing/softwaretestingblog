package com.java.basics;
class super1
{
	public void login()
	{
		System.out.println("Super Class Method Called");
	}
}
public class MethodOverriding {
	public void login()
	{
		System.out.println("Sub Class Method Called");
	}
	public static void main(String[] args)
	{
		MethodOverriding obj=new MethodOverriding();
		obj.login();

	}

}
