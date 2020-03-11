package com.structural.bridge.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class OracleDriver implements Driver{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		UtilConnection.connectDatabase("Oracle", 
								       "oracle.jdbc.driver.OracleDriver", 
								       "jdbc:oracle:thin:@localhost:1521:xe", 
								       "JDBCDATABASE", 
								       "123");
	}

}
