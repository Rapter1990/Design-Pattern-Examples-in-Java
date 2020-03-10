package objectpool;

import java.sql.Connection;

public class Main {

	public static void main(String args[]) {
		// Create the ConnectionPool:
		JDBCConnectionPool pool = new JDBCConnectionPool("oracle.jdbc.driver.OracleDriver", 
														 "jdbc:oracle:thin:@localhost:1521:xe",
														 "USERNAME",
				                                         "PASSWORD");

		// Get a connection:
		Connection con = pool.takeOut();
		// Return the connection:
		pool.takeIn(con);
	}
}
