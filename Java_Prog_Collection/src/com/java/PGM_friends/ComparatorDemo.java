package com.java.PGM_friends;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
			List<Employee> list = new ArrayList<Employee>();
		
			list.add(new Employee(121,"Sam",12000.66,new Date(1990,9,21)));
			list.add(new Employee(115,"Tom",15000.95,new Date(1992,8,19)));
			list.add(new Employee(125,"Roy",10000.45,new Date(1989,2,29)));
			list.add(new Employee(125,"Roy",10000.45,new Date(1992,10,8)));
			
			System.out.println(list);
			
			Collections.sort(list, new TestComparator());
			
			Iterator<Employee> it = list.iterator();
			while (it.hasNext()) {
				Employee emp = it.next();
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal()+"\t"+emp.getDoj());
			}
			Calendar c = Calendar.getInstance();
			System.out.println(c);
			Currency currency = Currency.getInstance("INR");
			System.out.println(currency.getNumericCode());
	}

}
