package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeansScope2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-scopes.xml");
		
		Student std1 = context.getBean(Student.class, "student");
		Student std2 = context.getBean(Student.class, "student");
		System.out.println(std1 == std2);
		System.out.println((std1.getAddress()) == (std2.getAddress()));
	}
}
