package iteratorexample;

public class EmployeeIterator implements Iterator<Employee> {
	
	private Employee[] employees;
    private int position;
    
	public EmployeeIterator(Employee[] employees) {
		super();
		this.employees = employees;
		this.position = 0;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		position = 0;
	}

	@Override
	public Employee next() {
		// TODO Auto-generated method stub
		return employees[position++];
	}

	@Override
	public Employee currentItem() {
		// TODO Auto-generated method stub
		return employees[position];
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= employees.length) {
			return false;
		}
            
        return true;
	}

}
