package com.java.arraylistEx;

public class Student {
	private Integer sid;
	private String name;
	private Double marks;
	
	public Student(String string, int i) {	}
	
	public Student(Integer sid, String name, Double marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}	
}