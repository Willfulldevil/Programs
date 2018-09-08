package com.Maven.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class CustomerRowMapper implements RowMapper, org.springframework.jdbc.core.RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ajay customer = new Ajay(rowNum, null, rowNum);
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("NAME"));
		customer.setAge(rs.getInt("AGE"));
		return customer;
	}

	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}