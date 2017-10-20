package com.java.arraylistEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistEx13 {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args)
	{
		List obj=new ArrayList();
		obj.add("Manoj");
		obj.add("Kumar");
		obj.add("Rana");
		List al=Collections.synchronizedList(obj);
		

	}

}
