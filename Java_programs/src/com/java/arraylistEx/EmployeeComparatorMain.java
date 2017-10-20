package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeComparatorMain {

	public static void main(String[] args) {
		List<EmployeeComparator1> list = new ArrayList<EmployeeComparator1>();
		
		list.add(new EmployeeComparator1(10, "Abc"));
		list.add(new EmployeeComparator1(30, "Def"));
		list.add(new EmployeeComparator1(20, "Ghi"));
		
		System.out.println(list);
		
		Collections.sort(list, new EmployeeComparator2());
		
		Iterator<EmployeeComparator1> it = list.iterator();
		while (it.hasNext()) {
			EmployeeComparator1 employee = it.next();
			System.out.println(employee.getId()+"\t"+employee.getName());
		}
	}
}