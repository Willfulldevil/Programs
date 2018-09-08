package com.Maven.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Maven.core.AjayDAO;
import com.Maven.core.Ajay;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Mrbeen.xml");
    	 
    	AjayDAO customerDAO = (AjayDAO) context.getBean("AjayDAO");
//    	Ajay customer = new Ajay(72, "vamshi",28);
//    	customerDAO.insert(customer);
  	
        Ajay customer1 = customerDAO.findByCustomerId(72);
        System.out.println(customer1);
        
    }
}
