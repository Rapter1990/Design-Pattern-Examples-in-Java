### Behavior Design Pattern - Template Method

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/templatemethod.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>AbstractClass</td>
    <td>Implement template methods and one or more abstract step methods</td>
  </tr>
  <tr>
    <td>ConcreteClassA,ConcreteClassB</td>
    <td>Implement it own step methods which are later called by template method</td>
  </tr>
  
</table>

<hr>
Description:

This design pattern provides a template method including structure of methods

For example :

```
public abstract class HouseTemplate {

	// template method
	public final void buildHouse() {
		houseTypeName();
		buildStart();
		placePillars();
		constructWalls();
		putWindows();
		System.out.println("House is completely built.");
	}

	// default implementation
	private void putWindows() {
		System.out.println("Putting Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void constructWalls();

	public abstract void placePillars();
	
	public abstract void houseTypeName();

	private void buildStart() {
		System.out.println("Constructing starts with cement,iron rods and sand");
	}
}


public class FarmHouse extends HouseTemplate {

	@Override
	public void houseTypeName() {
		// TODO Auto-generated method stub
		System.out.println("FarmHouse");
	}

	@Override
	public void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Concrete Walls");
	}

	@Override
	public void placePillars() {
		// TODO Auto-generated method stub
		System.out.println("Place Pillars to Farm House");
	}

}


```
