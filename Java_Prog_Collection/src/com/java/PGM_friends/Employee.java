package com.java.PGM_friends;

import java.util.Date;

public class Employee 
{
	private Integer id;
	private String name;
	private Double sal;
	private Date doj;
	
	public Employee(Integer id, String name, Double sal, Date doj) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.doj = doj;
	}

	public Employee(Integer id, String name, Double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	/*@Override
	public String toString() 
	{
		return "["+id+ ","+name+"," +sal+"]";
	}*/
	
}
