package compositeexample;

public class Main {

	public static void main(String[] args) {
		
		Developer dev1 = new Developer(100, "Developer 1", "Lead Developer");
		Developer dev2 = new Developer(101, "Developer 2", "Senior Developer"); 
		Developer dev3 = new Developer(102, "Developer 2", "Junior Developer");
        Developer dev4 = new Developer(103, "Developer 2", "Developer");
        
        CompanyDirectory devDirectory = new CompanyDirectory(); 
        devDirectory.addEmployee(dev1); 
        devDirectory.addEmployee(dev2);
        devDirectory.addEmployee(dev3); 
        devDirectory.addEmployee(dev4); 
        
        Designer des1 = new Designer(104, "Designer 1", "Lead Designer");
        Designer des2 = new Designer(105, "Designer 2", "Senior Designer"); 
        Designer des3 = new Designer(106, "Designer 2", "Junior Designer");
        Designer des4 = new Designer(107, "Designer 2", "Designer");
        
        CompanyDirectory designerDirectory = new CompanyDirectory(); 
        designerDirectory.addEmployee(des1); 
        designerDirectory.addEmployee(des2);
        designerDirectory.addEmployee(des3); 
        designerDirectory.addEmployee(des4); 
        
        Researcher res1 = new Researcher(108, "Researcher 1", "Senior Designer");
        Researcher res2 = new Researcher(109, "Researcher 2", "Designer"); 
        
        CompanyDirectory researcherDirectory = new CompanyDirectory(); 
        researcherDirectory.addEmployee(res1); 
        researcherDirectory.addEmployee(res2);
        
        Manager man1 = new Manager(110, "Manager 1", "Chief Manager");
        Manager man2 = new Manager(111, "Manager 2", "Financial Manager");
        Manager man3 = new Manager(112, "Manager 3", "Human Resources Manager");
        
        CompanyDirectory managerDirectory = new CompanyDirectory(); 
        managerDirectory.addEmployee(man1); 
        managerDirectory.addEmployee(man2);
        managerDirectory.addEmployee(man3);
        
        CompanyDirectory maindirectory = new CompanyDirectory();
        maindirectory.addEmployee(devDirectory);
        maindirectory.addEmployee(designerDirectory); 
        maindirectory.addEmployee(researcherDirectory);
        maindirectory.addEmployee(managerDirectory); 
        
        maindirectory.showEmployeeInformation(); 
		
	}
}
