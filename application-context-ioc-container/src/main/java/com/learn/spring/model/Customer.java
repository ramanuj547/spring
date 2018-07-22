package com.learn.spring.model;

public class Customer {

	private long id;
	private String name;
	private String email;
	private String mobole;
	
	public Customer() {
		System.out.println("Customer Obj Created !!");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getMobole() {
		return mobole;
	}

	public void setMobole(String mobole) {
		this.mobole = mobole;
	}
}
