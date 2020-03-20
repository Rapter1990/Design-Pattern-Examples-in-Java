package nullobjectexample;

public class NullCustomer extends AbstractCustomer{

	public NullCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isNameNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Null Customer";
	}

}
