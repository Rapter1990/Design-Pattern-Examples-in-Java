package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCRUDUtil {
	

	// to get the connection from methods like insert, view etc.   
	private Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "USERNAME", "PASSWORD");
		return con;

	}

	public int insert(String fname, String lname, int salary) throws SQLException {
		Connection c = null;

		PreparedStatement ps = null;

		int recordCounter = 0;

		try {

			c = getConnection();
			ps = c.prepareStatement("insert into employee(fname,lname,salary)values(?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setInt(3, salary);
			recordCounter = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

	// to view the data from the database
	public void view(String fname) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = getConnection();
			ps = con.prepareStatement("select * from employee where fname=?");
			ps.setString(1, fname);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("fname= " + rs.getString(1) + "\t" + "lname= " + rs.getString(2));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	// to update the password for the given username  
	public int update(int id,int salary) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;

		int recordCounter = 0;
		try {
			c = getConnection();
			ps = c.prepareStatement(" update employee set salary=? where id=" + id + " ");
			ps.setInt(1, salary);
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}

//to delete the data from the database   
	public int delete(int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try {
			c = getConnection();
			ps = c.prepareStatement(" delete from userdata where id= " + id + " ");
			recordCounter = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (c != null) {
				c.close();
			}
		}
		return recordCounter;
	}
}
