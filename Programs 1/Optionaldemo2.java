package com.java8;

public class Optionaldemo2 {
	int id;
	String name;
	String email;
	
	public Optionaldemo2(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Optionaldemo2 [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
