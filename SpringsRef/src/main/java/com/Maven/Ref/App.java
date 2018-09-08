package com.Maven.Ref;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("Mrbeen.xml");
 
	    Vamshi obj = (Vamshi) context.getBean("myBean");
	    System.out.println(obj);

	}
}