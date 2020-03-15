package facedeexample;

import java.sql.Connection;

public interface DatabaseTypeHelper {
	
	Connection getConnection();

	void createObject(Connection con);
	
	void getAllObjects(Connection con);
	
	void updateObject(Connection con);
	
	void deleteObject(Connection con);
}
