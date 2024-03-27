package com.prowings.myapp;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	
	public Employee() {
		super();
		System.out.println("Initializing Employee using no arg constructor");
	}

	public Employee(int id, String name, String address) {
		super();
		System.out.println("Initializing Employee using all arg constructor");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Initializing Employee id - using setter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Initializing Employee name - using setter");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		System.out.println("Initializing Employee address - using setter");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
