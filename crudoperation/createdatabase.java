package crudoperation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class login {

	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/employee";	
	private static final String username= "root";
	private static final String password="root";
	private static Connection conn;
	private static PreparedStatement pmst ;
  
	public static void main(String[] args) {
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url, username, password);	        
			String sql="CREATE DATABASE employee";

			pmst=conn.prepareStatement(sql);
			 int i=pms.executeUpdate();
	  		    if(i == 0) {
	  		    	System.out.println("Database created");
	  		    }
	  		    else {
	  		    	System.out.println("Not created");
	  		    }

			conn.close();
			pmst.close();
			scr.close();	
		} catch (Exception e) {
			e.printStackTrace();
			
		}
				
          
	}
}
	
