package com.java.PGM_friends;
class Engine
{
	void start()
	{
		System.out.println("Engine is starting...");
	}
}
class Car
{
	int price;
	String color;
	Engine en = new Engine();
	Car(int price,String color)
	{
		this.price=price;
		this.color=color;
	}
	void move()
	{
		System.out.println("The car is moving...");
		en.start();
	}
}

public class New1 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------------------");
		Car porche = new Car(3000000,"Carrera500");
		porche.move();
		System.out.println("----------------------------");
		Car lamborghini = new Car(3500000,"Lamborghini");
		lamborghini.move();
		System.out.println("----------------------------");
	}
}
