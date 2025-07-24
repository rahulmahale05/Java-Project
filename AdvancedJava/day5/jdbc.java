package AdvancedJava.day5;
import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school"; // ✅ Correct URL
        String user = "root";      // 👈 your MySQL username
        String password = "Rahul@1845"; // 👈 your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
