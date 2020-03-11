package compositeexample;

public class Person {

	private String name; 
    private long empId; 
    private String position;
    
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(long empId, String name,String position) {
		super();
		this.name = name;
		this.empId = empId;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", empId=" + empId + ", position=" + position + "]";
	} 
    
    
}
