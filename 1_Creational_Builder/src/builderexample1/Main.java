package builderexample1;

public class Main {

	public static void main(String[] args) {
		Developer developer = createDeveloper();
		Designer designer = createDesigner();
		
		showInformation(developer);
		System.out.println("");
		showInformation(designer);
	}

	private static Developer createDeveloper() {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		address.setHouseNumber("Developer House Number Code");
		address.setStreet("Developer Street");
		address.setCity("Developer City");
		address.setState("Developer State");
		address.setZipcode("Developer Zip Code");
		
		
		Developer developerDTO = 
				new Developer.DeveloperDTOBuilder()
				.setFirstName("Developer First Name")
				.setLastName("Developer Last Name")
				.setAge(39)
				.setGender("Male")
				.setAddress(address)
				.setEmpId("Developer ID")
				.setDeveloperSalary(1000)
				.setDeveloperJobTitle("Job Title")
				.setDeveloperJobDescription("Job Description")
				.build();
		
		return developerDTO;
	}
	
	private static Designer createDesigner() {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setHouseNumber("Designer House Number Code");
		address.setStreet("Designer Street");
		address.setCity("Designer City");
		address.setState("Designer State");
		address.setZipcode("Designer Zip Code");
		
		Designer designerDTO = 
				new Designer.DesignerDTOBuilder()
				.setFirstName("Designer First Name")
				.setLastName("Designer Last Name")
				.setAge(35)
				.setGender("Female")
				.setAddress(address)
				.setEmpId("Designer ID")
				.setDesignerSalary(1000)
				.setDesignerJobTitle("Job Title")
				.setDesignerJobDescription("Job Description")
				.build();
		
		return designerDTO;
	}

	
	private static void showInformation(Object person) {
		// TODO Auto-generated method stub
		if(person instanceof Developer) {
			Developer developer = (Developer) person;
			System.out.println("------------------Developer Information-------------");
			System.out.println("Developer First Name : " + developer.getFirstName());
			System.out.println("Developer Last Name : " + developer.getLastName());
			System.out.println("Developer Age : " + developer.getAge());
			System.out.println("Developer Gender : " + developer.getGender());
			System.out.println("Developer Address Information");
			System.out.println("\tDeveloper Address House Number: " + developer.getAddress().getHouseNumber());
			System.out.println("\tDeveloper Address Street: " + developer.getAddress().getStreet());
			System.out.println("\tDeveloper Address City: " + developer.getAddress().getCity());
			System.out.println("\tDeveloper Address State: " + developer.getAddress().getState());
			System.out.println("\tDeveloper Address Zip Code: " + developer.getAddress().getZipcode());
			System.out.println("Developer Developer Emp Id :" + developer.getEmpId());
			System.out.println("Developer Developer Salary :" + developer.getSalary());
			System.out.println("Developer Developer Job Title :" + developer.getJobTitle());
			System.out.println("Developer Developer Job Description :" + developer.getJobDescription());
		} else if (person instanceof Designer) {
			Designer designer = (Designer) person;
			System.out.println("------------------Designer Information-------------");
			System.out.println("Designer First Name : " + designer.getFirstName());
			System.out.println("Designer Last Name : " + designer.getLastName());
			System.out.println("Designer Age : " + designer.getAge());
			System.out.println("Designer Gender : " + designer.getGender());
			System.out.println("Designer Address Information");
			System.out.println("\tDesigner Address House Number: " + designer.getAddress().getHouseNumber());
			System.out.println("\tDesigner Address Street: " + designer.getAddress().getStreet());
			System.out.println("\tDesigner Address City: " + designer.getAddress().getCity());
			System.out.println("\tDesigner Address State: " + designer.getAddress().getState());
			System.out.println("\tDesigner Address Zip Code: " + designer.getAddress().getZipcode());
			System.out.println("Designer Developer Emp Id :" + designer.getEmpId());
			System.out.println("Designer Developer Salary :" + designer.getSalary());
			System.out.println("Designer Developer Job Title :" + designer.getJobTitle());
			System.out.println("Designer Developer Job Description :" + designer.getJobDescription());
		} else {
			System.out.println("No Defined Person");
		}
	}
}

