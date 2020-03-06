package builderexample1;

import java.io.Serializable;

public class Developer extends Employee implements Serializable {

	private double developerSalary;
	private String developerJobTitle;
	private String developerJobDescription;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// If you can use Builder Design Pattern, constructor that you create must be
	// private
	private Developer(DeveloperDTOBuilder builder) {
		super(builder.firstName, builder.lastName, builder.age, builder.gender, builder.address, builder.empId);
		// TODO Auto-generated constructor stub
		this.developerSalary = builder.developerSalary;
		this.developerJobTitle = builder.developerJobTitle;
		this.developerJobDescription = builder.developerJobDescription;
	}

	public void setDeveloperSalary(double developerSalary) {
		this.developerSalary = developerSalary;
	}

	public void setDeveloperJobTitle(String developerJobTitle) {
		this.developerJobTitle = developerJobTitle;
	}

	public void setDeveloperJobDescription(String developerJobDescription) {
		this.developerJobDescription = developerJobDescription;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return developerSalary * 1.3;
	}

	@Override
	public String getJobTitle() {
		// TODO Auto-generated method stub
		return "Developer" + developerJobTitle;
	}

	@Override
	public String getJobDescription() {
		// TODO Auto-generated method stub
		return "Developer" + developerJobDescription;
	}

	// Get builder instance
	public static DeveloperDTOBuilder getBuilder() {
		return new DeveloperDTOBuilder();
	}

	// Builder Design Pattern
	public static class DeveloperDTOBuilder {

		private String firstName;
		private String lastName;
		private int age;
		private String gender;
		private Address address;
		private String empId;
		private double developerSalary;
		private String developerJobTitle;
		private String developerJobDescription;

		public DeveloperDTOBuilder() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DeveloperDTOBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public DeveloperDTOBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public DeveloperDTOBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public DeveloperDTOBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public DeveloperDTOBuilder setAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public DeveloperDTOBuilder setEmpId(String empId) {
			this.empId = empId;
			return this;
		}
		
		public DeveloperDTOBuilder setDeveloperSalary(double developerSalary) {
			this.developerSalary = developerSalary;
			return this;
		}
		
		public DeveloperDTOBuilder setDeveloperJobTitle(String developerJobTitle) {
			this.developerJobTitle = developerJobTitle;
			return this;
		}
		
		public DeveloperDTOBuilder setDeveloperJobDescription(String developerJobDescription) {
			this.developerJobDescription = developerJobDescription;
			return this;
		}

		public Developer build() {
			return new Developer(this);
		}

	}

}
