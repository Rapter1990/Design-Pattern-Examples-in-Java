package simplefactory1;

public class EmployeeFactory {

	// To create new instances of our exist employees, use Simple Design Factory

	public static Employee getEmployee(Employee employee) {
		if (employee.getHourlyRate() >= 40) {

			return new FullTimeEmployee(employee.getFirstName(), employee.getLastName(), employee.getBirthday(),
					employee.getHourlyRate());
		} else {

			return new PartTimeEmployee(employee.getFirstName(), employee.getLastName(), employee.getBirthday(),
					employee.getHourlyRate());
		}
	}
}
