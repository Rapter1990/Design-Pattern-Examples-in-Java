package visitorexample;

public class Doctor implements Visitor{

	private String name;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void visit(Visitable visitable) {
		// TODO Auto-generated method stub
		Patient patient = (Patient) visitable;
		String nameOfPatient = patient.getName();
		String healthStatus = patient.getHealthStatus();
		
		System.out.println("Doctor: '" + this.getName() + "' does the checkup of the patient: '"
                + nameOfPatient + "' and Reported health "+ healthStatus +
                "\n-----------------------------------------------------------");
				
	}

}
