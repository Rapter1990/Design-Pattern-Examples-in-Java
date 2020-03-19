package iteratorexample;

public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		Employee employee1 = new Employee();
		employee1.setName("Employee Name 1");
		employee1.setSurname("Employee Surname 1");
		employee1.setAge(35);
		employee1.setRole("Employee Role 1");
		
		Employee employee2 = new Employee();
		employee2.setName("Employee Name 2");
		employee2.setSurname("Employee Surname 2");
		employee2.setAge(40);
		employee2.setRole("Employee Role 2");
		
		Employee employee3 = new Employee();
		employee3.setName("Employee Name 3");
		employee3.setSurname("Employee Surname 3");
		employee3.setAge(45);
		employee3.setRole("Employee Role 3");
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		
		
		List<Employee> list = new EmployeeList(employees);
		
		Iterator<Employee> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Employee currentEmployee = iterator.next();
            System.out.println(currentEmployee.getName() + " - " + 
			                   currentEmployee.getSurname() + " - " +
			                   currentEmployee.getAge() + " - " +
			                   currentEmployee.getRole()
            		 );
        }
		
	}
}
