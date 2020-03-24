### Behavior Design Pattern - Visitor

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/visitor.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Visitor</td>
    <td>Define visit operation for each concrete class</td>
  </tr>
  <tr>
    <td>ConcreteVisitorA,ConcreteVisitorB</td>
    <td>Implement its own operations</td>
  </tr>
  <tr>
    <td>ObjectStructure</td>
    <td>Iterate elements</td>
  </tr>
  <tr>
    <td>Element</td>
    <td>Define accept operation</td>
  </tr>
  <tr>
    <td>ElementA,ElementB</td>
    <td>Implement accept operation and call visitor's method</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to add new operations working on objects without changing and modifying class definations of all these objects. 

For example :

```
public interface Visitor {
	public void visit(Visitable visitable);
}

public interface Visitable {
	public void accept(Visitor visitor);
}

public class Patient implements Visitable{
	...
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}

public class Doctor implements Visitor{
	...
	@Override
	public void visit(Visitable visitable) {
		// TODO Auto-generated method stub
		Patient patient = (Patient) visitable;
		String nameOfPatient = patient.getName();
		String healthStatus = patient.getHealthStatus();
		
		System.out.println("Doctor: '" + this.getName() + "' does the checkup of the patient: '"
                + nameOfPatient + "' and Reported health "+ healthStatus +
                "\n-----------------------------------------------------------");
				
	}
}

 
```
