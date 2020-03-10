package main;

import java.sql.SQLException;

import singleton.JDBCEagerSingleton;
import singleton.JDBCEnumSingleton;
import singleton.JDBCLazyEagerSingleton;
import util.HibernateCRUDUtil;
import util.JDBCCRUDUtil;

public class Main {

	public static void main(String[] args) throws SQLException {
		threadSafeSingleton();
		jdbcEagerSingleton();
		jdbcLazyEagerSingleton();
		jdbcEnumSingleton();
	}

	private static void threadSafeSingleton() {
		// TODO Auto-generated method stub

		HibernateCRUDUtil ME = new HibernateCRUDUtil();

		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		/* List down all the employees */
		ME.listEmployees();

		/* Update employee's records */
		ME.updateEmployee(empID1, 5000);

		/* Delete an employee from the database */
		ME.deleteEmployee(empID2);

		/* List down new list of the employees */
		ME.listEmployees();

	}

	private static void jdbcEagerSingleton() throws SQLException {
		
		// JDBCCRUDUtil jdbccrudUtil = new JDBCCRUDUtil(); 
		
		// TODO Auto-generated method stub
		JDBCEagerSingleton jdbcEagerSingleton =  JDBCEagerSingleton.getInstance();
		JDBCCRUDUtil jdbccrudUtil = jdbcEagerSingleton.getJDBCCRUDUtil();
		
		jdbccrudUtil.insert("Zara1", "Ali1", 1000);
		
		
	}

	private static void jdbcLazyEagerSingleton() throws SQLException {
		// TODO Auto-generated method stub
		JDBCLazyEagerSingleton jdbcLazyEagerSingleton =  JDBCLazyEagerSingleton.getInstance();
		JDBCCRUDUtil jdbccrudUtil = jdbcLazyEagerSingleton.getJDBCCRUDUtil();
		
		jdbccrudUtil.insert("Zara2", "Ali2", 1000);
	}

	private static void jdbcEnumSingleton() throws SQLException {
		// TODO Auto-generated method stub
		JDBCEnumSingleton jdbcEnumSingleton =  JDBCEnumSingleton.INSTANCE;
		JDBCCRUDUtil jdbccrudUtil = jdbcEnumSingleton.getJDBCCRUDUtil();
		
		jdbccrudUtil.insert("Zara3", "Ali3", 1000);
	}
}
