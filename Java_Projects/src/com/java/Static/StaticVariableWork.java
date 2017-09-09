package com.java.Static;
class C{
	int a = 10;
}
class B{

	static int b = 20;
}
public class StaticVariableWork {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		B obj2 = new B();
		B obj3 = new B();
		B obj4 = new B();
		
		System.out.println("===================Static Variable========================");
		System.out.println(obj2.b); //20
		System.out.println(obj3.b); //20
		System.out.println(obj4.b);//20

		obj2.b =90;
		System.out.println(obj2.b);//90
		System.out.println(obj3.b);//90
		System.out.println(obj4.b);//90

		obj3.b= 80;
		System.out.println(obj2.b);//80
		System.out.println(obj3.b);//80
		System.out.println(obj4.b);//80

		obj4.b =50;
		System.out.println(obj2.b);//50
		System.out.println(obj3.b);//50
		System.out.println(obj4.b);//50

		System.out.println("====================Instant Variable=======================");
		C obj5 = new C();
		C obj6 = new C();
		C obj7 = new C();
		
		System.out.println(obj5.a);//10
		System.out.println(obj6.a);//10
		System.out.println(obj7.a);//10
		
		obj5.a = 40;
		System.out.println(obj5.a);//40
		System.out.println(obj6.a);//10
		System.out.println(obj7.a);//10

		obj6.a = 50;
		System.out.println(obj5.a);//40
		System.out.println(obj6.a);//50
		System.out.println(obj7.a);//10

		obj7.a = 60;
		System.out.println(obj5.a);//40
		System.out.println(obj6.a);//50
		System.out.println(obj7.a);//60

	}

}