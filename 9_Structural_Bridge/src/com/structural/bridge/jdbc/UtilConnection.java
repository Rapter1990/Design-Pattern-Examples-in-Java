package com.structural.bridge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilConnection {

	public static void connectDatabase(String text,
			                           String connectionClass,
			                           String connectingString,
			                           String databaseUsername,
			                           String password) {
		
		// TODO Auto-generated method stub
				System.out.println(text);

		        try {

		            Class.forName("oracle.jdbc.driver.OracleDriver");

		        } catch (ClassNotFoundException e) {

		            System.out.println("Where is your " + text + " Driver?");
		            e.printStackTrace();
		            return;

		        }

		        System.out.println(text + " JDBC Driver Registered!");

		        Connection connection = null;

		        try {

		            connection = DriverManager.getConnection(
		            		connectingString, databaseUsername, password);

		        } catch (SQLException e) {

		            System.out.println("Connection Failed! Check output console");
		            e.printStackTrace();
		            return;

		        }

		        if (connection != null) {
		            System.out.println("You made it, take control your database now!");
		        } else {
		            System.out.println("Failed to make connection!");
		        }
		
	}
}
