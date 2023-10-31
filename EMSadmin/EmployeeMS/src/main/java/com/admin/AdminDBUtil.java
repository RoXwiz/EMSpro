package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	
	public static List<Admin> validate(String userName, String password){
		
		ArrayList<Admin> adi = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost/ems";
		String user ="root";
		String pass = "80440991";
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Register the Driver
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			//sql query
			String sql = "select * from admin where userName='"+userName+"'and password='"+password+"'";
			//run sql query	
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String mobile = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				
				Admin a = new Admin(id,name,email,mobile,userU,passU);
				adi.add(a);
						
			}
			
			
		}
		
		catch(Exception a) {
			a.printStackTrace();
		}
		
		
		return adi;
		
		
	}
	
	public static boolean updateAdminData(String adid,String name, String email, String mobile, String username, String password){
		
		boolean isSuccess = false;
    	
    	//create db connection
    	String url = "jdbc:mysql://localhost/ems";
		String user ="root";
		String pass = "80440991";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Register the Driver
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "UPDATE admin SET name='"+name+"',email='"+email+"',mobile='"+mobile+"',password='"+password+"',userName='"+username+"' WHERE adid='"+adid+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    		return isSuccess;
	}
	
	public static boolean deleteAdminData(String adid){
		
		boolean isSuccess = false;
    	
    	//create db connection
    	String url = "jdbc:mysql://localhost/ems";
		String user ="root";
		String pass = "80440991";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Register the Driver
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "DELETE FROM admin WHERE adid = '"+adid+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    		return isSuccess;
	}

}
