package com.java.basics;

import java.util.Scanner;

public class prog1 
{
	public void BuyingItems(int a)
	{
		int Freeitem=0,TotalItems=0;
		if(a>0)
		{
			Freeitem=a/2;
			TotalItems=Freeitem+a;
		}
		System.out.println("BuyingItems:-"+a);
		System.out.println("FreeItems:-"+Freeitem);
		System.out.println("TotalItems:-"+TotalItems);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter buying Items:");
		num=in.nextInt();
		prog1 obj1=new prog1();
		obj1.BuyingItems(num);
	}

}
