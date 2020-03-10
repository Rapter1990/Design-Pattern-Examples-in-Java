package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.JDBCCRUDUtil;

public class JDBCEagerSingleton {

	// static member holds only one instance of the JDBCSingleton class.
	private static final JDBCEagerSingleton jdbc = new JDBCEagerSingleton();
	
	//JDBCSingleton prevents the instantiation from any other class.  
	private JDBCEagerSingleton() {
	}

	//Now we are providing gloabal point of access.  
	public static JDBCEagerSingleton getInstance() {
		return jdbc;
	}

	// to get the connection from methods like insert, view etc.   
	private Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "USERNAME", "PASSWORD");
		return con;

	}

	public JDBCCRUDUtil getJDBCCRUDUtil() {
		// TODO Auto-generated method stub
		return new JDBCCRUDUtil();
	}
}
