package com.employe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class EmployeDBUtil {

    public static boolean insertemploye(String name, String email, String mobile,String desg,String salary, String username, String password) {
    	
    	boolean isSuccess = false;
    	
    	//create db connection
    	String url = "jdbc:mysql://localhost/ems";
		String user ="root";
		String pass = "80440991";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Register the Driver
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into employe values (0,'"+name+"','"+email+"','"+mobile+"','"+desg+"','"+salary+"','"+username+"','"+password+"')";
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
