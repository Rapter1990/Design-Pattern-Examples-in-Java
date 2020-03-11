package compositeexample;

public class Researcher extends Person implements Employee{

	
	public Researcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Researcher(long empId, String name, String position) {
		super(empId, name, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showEmployeeInformation() {
		// TODO Auto-generated method stub
		System.out.println(super.getEmpId() + " - " +super.getName() + " - " + super.getPosition());
	}

}
