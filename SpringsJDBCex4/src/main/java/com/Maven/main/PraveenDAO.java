package com.Maven.main;

import java.util.List;

public interface PraveenDAO 
{
	public void insert(Praveen customer);
	
	public void insertNamedParameter(Praveen customer);
			
	public void insertBatch(List<Praveen> customer);
	
	public void insertBatchNamedParameter(List<Praveen> customer);
	
	public void insertBatchNamedParameter2(List<Praveen> customer);
			
	public void insertBatchSQL(String sql);
	
	public Praveen findByCustomerId(int custId);
	
	public Praveen findByCustomerId2(int custId);

	public List<Praveen> findAll();
	
	public List<Praveen> findAll2();
	
	public String findCustomerNameById(int custId);
	
	public int findTotalCustomer();
	
}




