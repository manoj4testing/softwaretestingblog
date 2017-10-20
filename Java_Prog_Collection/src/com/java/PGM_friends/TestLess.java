package com.java.PGM_friends;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestLess {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(121,"Sam",12000.66,new Date(1990,9,21)));
		list.add(new Employee(115,"Tom",15000.95,new Date(1992,8,19)));
		list.add(new Employee(125,"Roy",10000.45,new Date(1989,2,29)));
		
		System.out.println(list);
	}
}