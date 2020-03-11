package compositeexample;

public class Developer extends Person implements Employee{
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(long empId, String name, String position) {
		super(empId, name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showEmployeeInformation() {
		// TODO Auto-generated method stub
		System.out.println(super.getEmpId() + " - " +super.getName() + " - " + super.getPosition());
	}

}
