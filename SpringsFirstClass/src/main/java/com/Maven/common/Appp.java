package com.Maven.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Appp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Moduler.xml");
    	 
        Hello obj = (Hello) context.getBean("Ttt");
        obj.printHello();
        
    }
}

