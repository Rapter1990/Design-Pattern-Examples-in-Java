package visitorexample;

public class Patient implements Visitable{

	private String name;
	private String healthStatus;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, String healthStatus) {
		super();
		this.name = name;
		this.healthStatus = healthStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", healthStatus=" + healthStatus + "]";
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
}
