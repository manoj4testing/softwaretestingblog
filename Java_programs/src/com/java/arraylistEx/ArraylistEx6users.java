package com.java.arraylistEx;

public class ArraylistEx6users implements Comparable<ArraylistEx6users>
{
	private String uname;
	private String pwd;
	public ArraylistEx6users(String uname, String pwd)
	{
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	
	public String getPwd() 
	{
		return pwd;
	}
	public void setPwd(String pwd) 
	{
		this.pwd = pwd;
	}
	
	@Override
	public int compareTo(ArraylistEx6users a) 
	{
		return a.uname.compareTo(getUname());
	}
	
}
