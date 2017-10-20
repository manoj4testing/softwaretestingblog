package com.java.collection.hashtable;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MyHashtableEntrySet {

	public static void main(String[] args) 
	{
		Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from Hashtable
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }

	}

}
