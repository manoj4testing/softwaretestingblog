package com.java.PGM_friends;

interface Land{
	default void water(){System.out.println("Land :: water");} 
	default void sea(){System.out.println("Land :: sea");}
	default void grass(){System.out.println("Land :: grass");}
}
interface Fly extends Land{
	
}
interface Sail {
	default void grass(){System.out.println("Sail :: grass");}
}
class Vehicle{
	public void water(){
		System.out.println("Vehicle :: water");
	}
}
class Root extends Vehicle implements Land, Sail{
	public void grass(){
		System.out.println("Root :: grass");
		Land.super.grass();
	}
}
public class JavaOne1 {
	public void use(){
		Root root = new Root();
		root.water();
		root.sea();
		root.grass();
	}
	public static void main(String[] args) {
		JavaOne1 jone = new JavaOne1();
		jone.use();
		System.out.println("OK");
	}

}
