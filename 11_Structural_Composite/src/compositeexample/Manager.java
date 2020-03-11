package compositeexample;

public class Manager extends Person implements Employee{


	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(long empId, String name, String position) {
		super(empId, name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showEmployeeInformation() {
		// TODO Auto-generated method stub
		System.out.println(super.getEmpId() + " - " +super.getName() + " - " + super.getPosition());
	}

}
