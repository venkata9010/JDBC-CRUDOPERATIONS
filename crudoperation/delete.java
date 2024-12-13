package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete {
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/employee";	
	private static final String username= "root";
	private static final String password="root";
	private static Connection conn;
	private static PreparedStatement pms ;
	
	public static void main(String[] args) {
		 try {
			   Scanner scr = new Scanner(System.in);
	            Class.forName(Driver);
	            conn = DriverManager.getConnection(url, username, password);  
	            System.out.println("enter tablename");
	            String sql = "delete from " +scr.next()+" where id=?";
	  		    pms=conn.prepareStatement(sql);
	  		    System.out.println("enter id");
	  		    pms.setInt(1,scr.nextInt());
	  		    int i=pms.executeUpdate();
	  		    if(i == 0) {
	  		    	System.out.println("deleted");
	  		    }
	  		    else {
	  		    	System.out.println("error");
	  		    }
	  		    conn.close();
	  		    pms.close();
               scr.close();
	            

	        } catch (Exception e) {
	             e.printStackTrace();
	        } 
		
	}
		
}
