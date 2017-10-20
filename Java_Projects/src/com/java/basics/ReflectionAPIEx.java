package com.java.basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Axy
{ 
	@SuppressWarnings("unused")
	private void cube(String n)
	{
		System.out.println(n);
	} 
}
public class ReflectionAPIEx 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		@SuppressWarnings("rawtypes")
		Class c=Axy.class; 
		Object obj=c.newInstance(); 

		@SuppressWarnings("unchecked")
		Method m=c.getDeclaredMethod("cube",new Class[]{String.class}); 
		m.setAccessible(true); 
		m.invoke(obj,"Manoj"); 

	}

}
