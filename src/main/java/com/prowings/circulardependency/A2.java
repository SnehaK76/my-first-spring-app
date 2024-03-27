package com.prowings.circulardependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A2 implements ApplicationContextAware, InitializingBean{
	
	private B b;
	
	private ApplicationContext context;

	public A2() {
		super();
		System.out.println("Inside A2's no-arg constructor");
	}

	public A2(B b) {
		super();
		this.b = b;
		System.out.println("Inside A2(B b) constructor");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("Inside setter method of class A");
	}

	public void afterPropertiesSet() throws Exception {
		b = context.getBean(B.class, b);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	

}
