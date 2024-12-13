package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insert {
	
public static void main(String[] args) {
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            String sql = "CREATE DATABASE emp";
  		    PreparedStatement pmst=conn.prepareStatement(sql);
  		    pmst.executeUpdate();
  		    conn.close();
  		    pmst.close();

            System.out.println("Database  created successfully.");

        } catch (Exception e) {
            System.out.println("Error");
        } 
        }
    

}
