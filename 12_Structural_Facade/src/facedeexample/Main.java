package facedeexample;

public class Main {

	public static void main(String[] args) {
		FacadeHelper.create(DatabaseType.ORACLE);
		FacadeHelper.create(DatabaseType.MYSQL);
		
		FacadeHelper.read(DatabaseType.ORACLE);
		FacadeHelper.read(DatabaseType.MYSQL);
		
		FacadeHelper.update(DatabaseType.ORACLE);
		FacadeHelper.update(DatabaseType.MYSQL);
		
		FacadeHelper.delete(DatabaseType.ORACLE);
		FacadeHelper.delete(DatabaseType.MYSQL);
	}
}
