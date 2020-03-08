package prototype1;

public class AuthorizedPerson extends Person{

	private boolean enabled;
	
	public AuthorizedPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 1.3;
	}

	@Override
	public String toString() {
		return "AuthorizedPerson [enabled=" + enabled + "]";
	}
	
	

}
