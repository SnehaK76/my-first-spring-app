package com.prowings.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {
	
	
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("spring-beans-beanlifecycle.xml");
		
		MyBean mb = context.getBean(MyBean.class, "mybean");
		
		System.out.println(mb);
		
		context.registerShutdownHook();
	}
}
