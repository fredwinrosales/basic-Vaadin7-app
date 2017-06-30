package com;

import java.sql.*;

/**
 * Created by frosales on 30/06/2017.
 */
public class Main {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] a){
        java.sql.Connection conn = null;
        Statement stmt = null;
        String sql = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully...");

            stmt = conn.createStatement();

            sql = "CREATE TABLE EMPLOYEE" +
                    "(ID INTEGER NOT NULL," +
                    "NAME CHAR(25)," +
                    "EMAIL VARCHAR(25) NOT NULL," +
                    "PRIMARY KEY (ID))";

            stmt.executeUpdate(sql);

            sql = "INSERT INTO EMPLOYEE VALUES (101, 'Fredwin', 'fredwinrosales@gmail.com')";

            stmt.executeUpdate(sql);

            sql = "SELECT * FROM EMPLOYEE";

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
            }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
