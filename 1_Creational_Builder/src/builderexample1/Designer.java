package builderexample1;

import java.io.Serializable;

public class Designer extends Employee implements Serializable{
	
	private double designerSalary;
	private String designerJobTitle;
	private String designerJobDescription;
	
	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// If you can use Builder Design Pattern, constructor that you create must be private 
	private Designer(DesignerDTOBuilder builder) {
		super(builder.firstName, builder.lastName, builder.age, builder.gender, builder.address, builder.empId);
		// TODO Auto-generated constructor stub
		this.designerSalary = builder.designerSalary;
		this.designerJobTitle = builder.designerJobTitle;
		this.designerJobDescription = builder.designerJobDescription;
	}
	
	
	public void setDesignerSalary(double designerSalary) {
		this.designerSalary = designerSalary;
	}

	public void setDesignerJobTitle(String designerJobTitle) {
		this.designerJobTitle = designerJobTitle;
	}

	public void setDesignerJobDescription(String designerJobDescription) {
		this.designerJobDescription = designerJobDescription;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return designerSalary * 1.1;
	}

	@Override
	public String getJobTitle() {
		// TODO Auto-generated method stub
		return "Designer" +  designerJobTitle;
	}

	@Override
	public String getJobDescription() {
		// TODO Auto-generated method stub
		return "Designer" + designerJobDescription;
	}
	
	//Get builder instance
	public static DesignerDTOBuilder getBuilder() {
		return new DesignerDTOBuilder();
	}

	//Builder Design Pattern
	public static class DesignerDTOBuilder {
		
		private String firstName;
		private String lastName;
		private int age;
		private String gender;
		private Address address;
		private String empId;
		private double designerSalary;
		private String designerJobTitle;
		private String designerJobDescription;
		
		public DesignerDTOBuilder() {
			super();
			// TODO Auto-generated constructor stub
		}
		

		public DesignerDTOBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public DesignerDTOBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public DesignerDTOBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public DesignerDTOBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public DesignerDTOBuilder setAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public DesignerDTOBuilder setEmpId(String empId) {
			this.empId = empId;
			return this;
		}
		
		public DesignerDTOBuilder setDesignerSalary(double designerSalary) {
			this.designerSalary = designerSalary;
			return this;
		}
		
		public DesignerDTOBuilder setDesignerJobTitle(String designerJobTitle) {
			this.designerJobTitle = designerJobTitle;
			return this;
		}
		
		public DesignerDTOBuilder setDesignerJobDescription(String designerJobDescription) {
			this.designerJobDescription = designerJobDescription;
			return this;
		}
		
		public Designer build() {
			return new Designer(this);
		}
	}
}
