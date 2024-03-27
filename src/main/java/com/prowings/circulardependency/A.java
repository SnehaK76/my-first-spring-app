package com.prowings.circulardependency;

public class A {
	
	private B b;

	public A() {
		super();
		System.out.println("Inside A's no-arg constructor");
	}

	public A(B b) {
		super();
		this.b = b;
		System.out.println("Inside A(B b) constructor");
	}

	public void init() {
		b.setA(this);
		System.out.println("setting dependency using custom init method");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("Inside setter method of class A");
	}
	

}
