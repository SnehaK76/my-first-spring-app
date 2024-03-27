package com.prowings.myapp;

public class C {

	public C() {
		super();
		System.out.println("C initialized!");
	}
	
	public C(String c) {
		super();
		System.out.println(c.getClass().getName());
		System.out.println(">>>>>>>>> Value :"+c);
		System.out.println("C(c) initialized!");
	}
	
}
