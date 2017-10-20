package com.java.basics;
class ab
{
	public void a()
	{
		System.out.println("Inside Method A");
	}
}
public class ParentReference extends ab
{
	public void a()
	{
		System.out.println("Inside Overriding Method A");
	}
	public void b()
	{
		System.out.println("Inside Method B");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		//ab obj=new ab();
		//obj.a();
		ab abc=new ParentReference();
		abc.a();
		ParentReference abx=new ParentReference();
		//abx.a();
		//abx.b();
		//ParentReference aby=new ab();
		

	}

}
