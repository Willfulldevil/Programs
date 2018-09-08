package com.Maven.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Mrbeen.xml");

		Pavan cust = (Pavan) context.getBean("SimpleBean");
		System.out.println(cust);
	}
}