package JDBC;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        String sql = "SELECT name FROM customers WHERE id = 103";
        String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "2002";
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String name = rs.getString(1);
            System.out.println(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Data fetched done!");
        }
    }
}
