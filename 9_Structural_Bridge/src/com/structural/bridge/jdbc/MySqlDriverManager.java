package com.structural.bridge.jdbc;

public class MySqlDriverManager extends DriverManager{

	public MySqlDriverManager(Driver driverConnection) {
		super(driverConnection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getconnection() {
		// TODO Auto-generated method stub
		driverConnection.connect();
	}

}
