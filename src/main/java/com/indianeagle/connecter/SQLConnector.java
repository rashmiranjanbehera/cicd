package com.indianeagle.connecter;

import java.sql.*;
import java.util.List;

public class SQLConnector {

    public static Connection createConnection() throws  ClassNotFoundException, SQLException {
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://localhost:3036/emp";

        //Database Username
        String username = "root";

        //Database Password
        String password = "guru99";


        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl, username, password);
        return con;
    }

    public List<String> getData(Connection con) throws SQLException {

        List<String> data =null;

        //Create Statement Object
        Statement stmt = con.createStatement();
        //Query to Execute
        String query = "select *  from employee;";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String myName = rs.getString(1);
            String myAge = rs.getString(2);
            System. out.println(myName+"  "+myAge);
        }
        // closing DB Connection
        con.close();

        return data;
    }
}
