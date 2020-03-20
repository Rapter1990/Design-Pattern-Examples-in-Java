package nullobjectexample;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RealCustomer(String name) {
		this.name = name;	
	}

	@Override
	public boolean isNameNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
