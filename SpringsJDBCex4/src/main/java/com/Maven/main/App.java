package com.Maven.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Mrbeen.xml");
    	 
        PraveenDAO customerDAO = (PraveenDAO) context.getBean("Been");
        Praveen customer1 = new Praveen(1, "p",11);
        Praveen customer3 = new Praveen(2, "p",22);
        Praveen customer2 = new Praveen(3, "p",33);
  
        List<Praveen>customers = new ArrayList<Praveen>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        
        customerDAO.insertBatch(customers);

        String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
        customerDAO.insertBatchSQL(sql);
      
    }
}
