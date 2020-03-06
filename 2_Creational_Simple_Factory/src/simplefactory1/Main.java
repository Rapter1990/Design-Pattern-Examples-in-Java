package simplefactory1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// FullTimeEmployee
		Employee employee1 = new Employee() {

			@Override
			public double getHourlyRate() {
				// TODO Auto-generated method stub
				return 45;
			}
		};
		employee1.setFirstName("Employee 1 First Name");
		employee1.setLastName("Employee 1 Last Name");
		Date birthdayOfEmployee1 = parseDate("1987-10-10");
		employee1.setBirthday(birthdayOfEmployee1);

		// PartTimeEmployee
		Employee employee2 = new Employee() {

			@Override
			public double getHourlyRate() {
				// TODO Auto-generated method stub
				return 30;
			}
		};
		employee2.setFirstName("Employee 2 First Name");
		employee2.setLastName("Employee 2 Last Name");
		Date birthdayOfEmployee2 = parseDate("1987-09-09");
		employee2.setBirthday(birthdayOfEmployee2);

		showInformation(employee1);
		System.out.println();
		showInformation(employee2);
	}

	public static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static void showInformation(Employee employee) {
		// TODO Auto-generated method stub
		Employee resultEmployeeType = EmployeeFactory.getEmployee(employee);
		System.out.println(resultEmployeeType);
	}
}
