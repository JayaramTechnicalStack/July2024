package com.org.io;

import java.io.Serializable;

public class Student implements Serializable {

	

	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4540269035151293662L;
	private int id;
	private transient String name;
	private  transient int  age;
	private transient String course;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	
	

	
}
