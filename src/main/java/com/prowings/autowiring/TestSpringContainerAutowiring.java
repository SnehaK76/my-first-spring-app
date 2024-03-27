package com.prowings.autowiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainerAutowiring {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-autowiring.xml");
		
		Person person = context.getBean(Person.class, "person");
     	
		System.out.println(person);
	}
}
