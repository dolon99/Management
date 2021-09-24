package com.customer.management.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.customer.management.dao.ConnectionProvider;

public class DaoImplementation {
	
	ConnectionProvider connectionProvider = new ConnectionProvider();
	
	
	public void insertIntoDB(int id, String name, String address) {
		try {
			Connection conn = connectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("insert into customer values(?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void displayFromDB(int id) {
		try {
			Connection conn = connectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select name, address from customer where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("---NAME---"+"\t"+"---ADDRESS---\n");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
