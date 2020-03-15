package facedeexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDatabaseHelper extends Database implements DatabaseTypeHelper{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Database database = new Database() {
		};
		database.setDriverName("com.mysql.jdbc.Driver");
		database.setConnectionString("jdbc:mysql://localhost:3306/databaseName");
		database.setUsername("username");
		database.setPassword("password");
		
		
		return UtilConnection.connectDatabase(
				"MySql", 
				database.getDriverName(), 
				database.getConnectionString(), 
				database.getUsername(),
				database.getPassword());
	}

	@Override
	public void createObject(Connection con) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
			statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void getAllObjects(Connection con) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM Users";
		 
		Statement statement;
		try {
			statement = con.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String pass = result.getString(3);
			    String fullname = result.getString("fullname");
			    String email = result.getString("email");
			 
			    String output = "User #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateObject(Connection con) {
		// TODO Auto-generated method stub
		String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
		 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, "123456789");
			statement.setString(2, "William Henry Bill Gates");
			statement.setString(3, "bill.gates@microsoft.com");
			statement.setString(4, "bill");
			 
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteObject(Connection con) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Users WHERE username=?";
		 
		PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, "bill");
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	

}
