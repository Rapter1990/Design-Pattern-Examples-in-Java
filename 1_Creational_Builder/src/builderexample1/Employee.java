package builderexample1;

import java.io.Serializable;

public abstract class Employee extends Person implements Serializable{

	private String empId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String lastName, int age, String gender, Address address,String empId) {
		super(firstName, lastName, age, gender, address);
		// TODO Auto-generated constructor stub
		this.empId = empId;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public abstract double getSalary();
	public abstract String getJobTitle();
	public abstract String getJobDescription();
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
	
}
