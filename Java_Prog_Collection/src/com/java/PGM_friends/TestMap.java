package com.java.PGM_friends;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>(0);
		map.put(1,"ab");
		map.put(2,"cd");
		map.put(3,"ef");
		Set<Entry<Integer,String>> set = map.entrySet();
		Iterator<Entry<Integer,String>> it = set.iterator();
		System.out.println("Key"+"\t"+"Value");
		System.out.println("--------------Iterator");
		while (it.hasNext()) {
			Map.Entry<Integer,String> entry =  it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("--------------for loop");
		for (Iterator<Entry<Integer, String>> iterator = set.iterator(); iterator.hasNext();) {
			Entry<Integer, String> entry =  iterator.next();
			System.out.println(entry.getValue());
		}
		System.out.println("--------------foreach");
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getValue());
		}
		List<String> list = (List<String>) map.values();
		Set<Integer> entrySet = map.keySet();
	}
}