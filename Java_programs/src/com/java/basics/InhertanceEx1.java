package com.java.basics;
class A11
{
	void test1()
	{
		System.out.println("test1 of A");
	}
}
class B11 extends A11
{
	void test1()
	{
		System.out.println("test1 of B");
	}
}
class C11 extends B11
{
	void sample(A11 a)
	{
		System.out.println("sample method");
		a.test1();
	}
}
class InhertanceEx1
{
	public void main(String[] args)
	{
		C11 c1 = new C11();
		c1.sample(new A11());
		c1.sample(new B11());
		c1.test1();
	}
}