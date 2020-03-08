package prototype1;

public class Employee extends Person{

	private String jobTitle;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 1.2;
	}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + "]";
	}
	
	

}
