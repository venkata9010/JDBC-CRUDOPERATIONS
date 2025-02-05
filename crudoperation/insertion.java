package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertOperation {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/emp"; // Ensure 'emp' database exists
        String username = "root";
        String password = "root";

        String insertSql = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSql)) {

            // Set the values for the placeholders
            pstmt.setString(1, "John Doe");
            pstmt.setString(2, "Software Engineer");
            pstmt.setDouble(3, 75000.00);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("A new employee has been inserted successfully.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
