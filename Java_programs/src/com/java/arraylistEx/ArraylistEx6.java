package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistEx6 {

	public static void main(String[] args) 
	{
		List<ArraylistEx6users> obj=new ArrayList<ArraylistEx6users>();
		obj.add(new ArraylistEx6users("Manoj","abc"));
		obj.add(new ArraylistEx6users("Biku","stu"));
		obj.add(new ArraylistEx6users("Gopal","pqr"));
		obj.add(new ArraylistEx6users("Ananat","xyz"));
		
		Collections.sort(obj);
		for (ArraylistEx6users a : obj) {
			System.out.println(a.getUname()+"\t"+a.getPwd());
		}
	}

}
