package compositeexample;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void showEmployeeInformation() {
		// TODO Auto-generated method stub
		for (Employee emp : employeeList) {
			emp.showEmployeeInformation();
		}
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
}
