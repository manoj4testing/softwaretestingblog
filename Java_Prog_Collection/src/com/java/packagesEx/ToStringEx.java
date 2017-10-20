package com.java.packagesEx;
class student
{
	int rollno;
	String name;
	student(int i,String j)
	{
		this.rollno=i;
		this.name=j;
	}
	void display()
	{
		System.out.println("Roll No Is : -" + rollno);
		System.out.println("Name Is : - " + name);
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}

public class ToStringEx
{

	public static void main(String[] args) 
	{
			student obj=new student(10, "Manoj");
			//obj.set();
			System.out.println(obj.toString());

	}

}
