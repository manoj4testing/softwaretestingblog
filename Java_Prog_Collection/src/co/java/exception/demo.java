package co.java.exception;

import java.util.HashMap;
import java.util.Map;

public class demo  
{
	public static void main(String[] args) 
	{
		Map<Integer, String> obj=new HashMap<>();
		obj.put(101, "a");
		obj.put(102, "b");
		obj.put(102, "new value");
		obj.put(102, "new value1");
		obj.put(102, "new value2");
		System.out.println(obj.get(102));
		
		
	}
}
