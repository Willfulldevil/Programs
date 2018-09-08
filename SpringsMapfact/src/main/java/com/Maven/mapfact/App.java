package com.Maven.mapfact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Mrbeen.xml");

		Vamshi cust = (Vamshi) context.getBean("Ajay");
		System.out.println(cust);
		
	}
}