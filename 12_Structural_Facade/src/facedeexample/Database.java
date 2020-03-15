package facedeexample;

import java.io.Serializable;

public abstract class Database implements Serializable {
	
	private String driverName;
	private String connectionString;
	private String username;
	private String password;
	
	public Database() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [driverName=" + driverName + ", connectionString=" + connectionString + ", username="
				+ username + ", password=" + password + "]";
	}
	
	

}
