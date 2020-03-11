package com.structural.bridge.jdbc;

public class Main {

	public static void main(String[] args) {
		
		DriverManager oracleManager = new OracleDriverManager(new OracleDriver());
		oracleManager.getconnection();
		
		
		DriverManager mysqlManager = new OracleDriverManager(new MySqlDriver());
		mysqlManager.getconnection();
	}
}
