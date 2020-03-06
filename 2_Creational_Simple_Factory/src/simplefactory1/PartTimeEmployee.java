package simplefactory1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PartTimeEmployee extends Employee {

	private double hourlyRate;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String firstName, String lastName, Date birthday, double hourlyRate) {
		super(firstName, lastName, birthday);
		// TODO Auto-generated constructor stub
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double getHourlyRate() {
		// TODO Auto-generated method stub
		return hourlyRate;
	}

	@Override
	public String toString() {
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String birthday = formatter.format(super.getBirthday());
		
		String information = "PartTimeEmployee Information\n"
				   		   + "First Name : " + super.getFirstName() +"\n"
				           + "Last Name : " + super.getLastName() +"\n"
				           + "Birthday : " + birthday +"\n"
				           + "HourlyRate : " + hourlyRate;
		return information;
	}
	
}
