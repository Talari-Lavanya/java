package Exception;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to connect to a non-existent database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "root", "password");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}
