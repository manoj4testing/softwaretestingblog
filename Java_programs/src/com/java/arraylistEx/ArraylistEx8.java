package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistEx8 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(123,"Sam",45.65));
		list.add(new Student(110,"Tom",65.32));
		list.add(new Student(125,"Roy",53.21));
		
		Collections.sort(list,new StudentComparator());
		/*for (Student student : list) {
		
		}*/
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.getSid()+"\t"+student.getName()+"\t"+student.getMarks());
		}
	}

}
