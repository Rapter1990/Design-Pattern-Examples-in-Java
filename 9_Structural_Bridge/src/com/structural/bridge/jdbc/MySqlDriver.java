package com.structural.bridge.jdbc;

public class MySqlDriver implements Driver{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		UtilConnection.connectDatabase("MySql", 
									   "com.mysql.jdbc.Driver", 
									   "jdbc:mysql://localhost:3306/JDBCDATABASE", 
									   "JDBCDATABASE", 
									   "123");
	}

}
