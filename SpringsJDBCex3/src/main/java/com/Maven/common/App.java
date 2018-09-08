package com.Maven.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Maven.customer.dao.CustomerDAO;
import com.Maven.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
   	 
    	CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
    	Customer customer = new Customer(17, "vamshi",28);
   	    customerDAO.insert(customer);
  	
    	Customer customer1 = customerDAO.findByCustomerId(17);
        System.out.println(customer1);
        
    }
    	
    }

