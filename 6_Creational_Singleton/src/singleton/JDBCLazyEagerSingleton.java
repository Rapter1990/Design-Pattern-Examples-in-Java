package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import util.JDBCCRUDUtil;

public class JDBCLazyEagerSingleton {

	// static member holds only one instance of the JDBCSingleton class.

		private static  JDBCLazyEagerSingleton jdbc;

		//JDBCSingleton prevents the instantiation from any other class.  
		private JDBCLazyEagerSingleton() {
		}

		//Now we are providing gloabal point of access.  
		public static JDBCLazyEagerSingleton getInstance() {
			if (jdbc == null) {
				jdbc = new JDBCLazyEagerSingleton();
			}
			return jdbc;
		}

		public JDBCCRUDUtil getJDBCCRUDUtil() {
			// TODO Auto-generated method stub
			return new JDBCCRUDUtil();
		}

}
