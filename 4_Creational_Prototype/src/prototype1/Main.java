package prototype1;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setSalary(1200);
		Employee employee1 = (Employee) employee.clone();
		employee1.setJobTitle("Employee 1 Job Title");
		Employee employee2 = (Employee) employee.clone();
		employee2.setJobTitle("Employee 2 Job Title");
		
		System.out.println("Employee Salary : " + employee.getSalary());
		System.out.println("Employee 1 Salary : " + employee1.getSalary());
		System.out.println("Employee 1 Job Title : " + employee1.getJobTitle());
		System.out.println("Employee 2 Salary : " + employee2.getSalary());
		System.out.println("Employee 2 Job Title : " + employee1.getJobTitle());
		
		AuthorizedPerson authorizedPerson = new AuthorizedPerson();
		authorizedPerson.setSalary(1300);
		
		AuthorizedPerson authorizedPerson1 = (AuthorizedPerson) authorizedPerson.clone();
		authorizedPerson1.setEnabled(false);
		AuthorizedPerson authorizedPerson2 = (AuthorizedPerson) authorizedPerson.clone();
		authorizedPerson1.setEnabled(true);
		
		System.out.println("AuthorizedPerson Authorized Situation : " + authorizedPerson.getSalary());
		System.out.println("AuthorizedPerson1 Authorized Situation : " + authorizedPerson1.isEnabled());
		System.out.println("AuthorizedPerson1 Salary : " + authorizedPerson1.getSalary());
		System.out.println("AuthorizedPerson2 Authorized Situation : " + authorizedPerson2.isEnabled());
		System.out.println("AuthorizedPerson2 Salary : " + authorizedPerson2.getSalary());
		
	}

}
