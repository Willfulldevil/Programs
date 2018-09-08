package com.Maven.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcAjayDAO extends JdbcDaoSupport implements AjayDAO
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	
	public void insert(Ajay customer){
		
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//		JdbcTemplate = new JdbcTemplate(dataSource);
		
		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(),
			customer.getName(),customer.getAge() });
	}
				
	
//		Connection conn = null;
//		
//		try {
//			conn = dataSource.getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, customer.getCustId());
//			ps.setString(2, customer.getName());
//			ps.setInt(3, customer.getAge());
//			ps.executeUpdate();
//			ps.close();
//			
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//			
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {}
//			}
//		}
//	}
	
//	public Customer findByCustomerId(int custId){
//		 
//		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
// 
//		Customer customer = (Customer)getJdbcTemplate().queryForObject(
//				sql, new Object[] { custId }, new CustomerRowMapper());
//	
//		return customer;
//	}
	
	public Ajay findByCustomerId(int custId){
		
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		Ajay customer = (Ajay)getJdbcTemplate().queryForObject(sql, new Object[] { custId }, new CustomerRowMapper());
	
		return customer;
	}
	}
		
		
//		Connection conn = null;
//		
//		try {
//			conn = dataSource.getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, custId);
//			Ajay customer = null;
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				customer = new Ajay(
//						rs.getInt("CUST_ID"),
//						rs.getString("NAME"), 
//						rs.getInt("Age")
//				);
//			}
//			rs.close();
//			ps.close();
//			return customer;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		} finally {
//			if (conn != null) {
//				try {
//				conn.close();
//				} catch (SQLException e) {}
//			}
//		}
//	}
//
//
//}




