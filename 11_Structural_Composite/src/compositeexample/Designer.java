package compositeexample;

public class Designer extends Person implements Employee{

	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designer(long empId, String name, String position) {
		super(empId, name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showEmployeeInformation() {
		// TODO Auto-generated method stub
		System.out.println(super.getEmpId() + " - " +super.getName() + " - " + super.getPosition());
	}

}
