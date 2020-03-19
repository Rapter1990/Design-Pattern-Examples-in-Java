package iteratorexample;

public class EmployeeList implements List<Employee>{

	private Employee[] employees;
    
    public EmployeeList(Employee[] employees)
    {
        this.employees = employees;
    }
	
	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return new EmployeeIterator(employees);
	}

}
