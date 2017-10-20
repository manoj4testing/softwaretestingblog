package com.java.arraylistEx;

import java.util.Comparator;

public class EmployeeComparator2 implements Comparator<EmployeeComparator1> {

	@Override
	public int compare(EmployeeComparator1 e1, EmployeeComparator1 e2) {
		if (e1.getId() > e2.getId()) {
			return 1;
		}
		if (e1.getId() < e2.getId()) {
			return -1;
		}
		return 0;
	}

}
