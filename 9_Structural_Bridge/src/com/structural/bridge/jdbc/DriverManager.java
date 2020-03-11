package com.structural.bridge.jdbc;

public abstract class DriverManager {

	// Composition -> relationship with Driver
	protected Driver driverConnection;

	public DriverManager(Driver driverConnection) {
		super();
		this.driverConnection = driverConnection;
	}
	
	public abstract void getconnection();
}
