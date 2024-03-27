package com.prowings.circulardependency;

public class B {
	
	private A a;

	public B() {
		super();
		System.out.println("Inside B's no-arg constructor");
	}

	public B(A a) {
		super();
		this.a = a;
	}



	public A getA2() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("Inside setter method of class B");
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	
	
	
}
