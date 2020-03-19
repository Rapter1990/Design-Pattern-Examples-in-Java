package iteratorexample;

public class Employee extends Person{

	private String role;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String surname, int age, String role) {
		super(name, surname, age);
		// TODO Auto-generated constructor stub
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [role=" + role + "]";
	}
	
}
