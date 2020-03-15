package facedeexample;

import java.sql.Connection;
import java.sql.SQLException;

public class FacadeHelper {

	public static void create(DatabaseType databaseType) {
		Connection con = null;
		try {
			con = getConnection(con, databaseType);
			DatabaseTypeHelper database = getDatabase(databaseType);
			database.createObject(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public static void read(DatabaseType databaseType) {
		Connection con = null;
		try {

			con = getConnection(con, databaseType);
			DatabaseTypeHelper database = getDatabase(databaseType);
			database.getAllObjects(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void update(DatabaseType databaseType) {
		Connection con = null;
		try {
			con = getConnection(con, databaseType);
			DatabaseTypeHelper database = getDatabase(databaseType);
			database.updateObject(con);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void delete(DatabaseType databaseType) {
		Connection con = null;
		try {
			con = getConnection(con, databaseType);
			DatabaseTypeHelper database = getDatabase(databaseType);
			database.deleteObject(con);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Connection getConnection(Connection con, DatabaseType databaseType) {
		switch (databaseType) {
		case ORACLE:
			con = new OracleDatabaseHelper().getConnection();
			break;
		case MYSQL:
			con = new MySqlDatabaseHelper().getConnection();
			break;
		default:
			break;
		}

		return con;
	}
	
	private static DatabaseTypeHelper getDatabase(DatabaseType databaseType) {
		// TODO Auto-generated method stub
		DatabaseTypeHelper databaseTypeHelper = null;
		
		switch (databaseType) {
		case ORACLE:
			databaseTypeHelper = new OracleDatabaseHelper();
			break;
		case MYSQL:
			databaseTypeHelper = new MySqlDatabaseHelper();
			break;
		default:
			break;
		}
		
		return databaseTypeHelper;
		
	}

}
