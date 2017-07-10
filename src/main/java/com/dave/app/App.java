package com.dave.app;

import java.sql.*;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        runQuery();
    }

    public static void runQuery() throws Exception
	{
		Class.forName("org.apache.drill.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:drill:drillbit=localhost");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from cp.`employee.json`");
		while(rs.next()){
		System.out.println(rs.getString(1) + " " + rs.getInt(12));
		}
	}
}
