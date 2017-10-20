package com.java.PGM_friends;

import java.util.Comparator;
import java.util.Date;

public class TestComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		Date d1 = e1.getDoj();
		Date d2 = e2.getDoj();
		
		if (d1.after(d2)) {
			return 2;
		}
		else if(d1.before(d2)){
			return -2;
		}
		else{
			return 0;
		}
		
	}
}