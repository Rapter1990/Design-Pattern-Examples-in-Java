package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.JDBCCRUDUtil;

public enum JDBCEnumSingleton {
	INSTANCE;
	private JDBCEnumSingleton() {
		
	}

	public JDBCCRUDUtil getJDBCCRUDUtil() {
		// TODO Auto-generated method stub
		return new JDBCCRUDUtil();
	}
	
}
