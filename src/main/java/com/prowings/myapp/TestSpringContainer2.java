package com.prowings.myapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-1.xml");
		
     	Employee emp1 = context.getBean(Employee.class, "emp");
     	
	}
}
