### Behavior Design Pattern - Null Object

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/nullobject.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Control Abstarct Class to create concrete or null object</td>
  </tr>
  <tr>
    <td>AbstractClass</td>
    <td>Defines operations used by client</td>
  </tr>
  <tr>
    <td>ConcreteClass</td>
    <td>Implement operations defined in its parent class</td>
  </tr>
  <tr>
    <td>NullClass</td>
    <td>Define null object</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to represent absence of real object.

For example :

```
public abstract class AbstractCustomer {

	protected String name;
	public abstract boolean isNameNull();
	public abstract String getName();
}

public class CustomerFactory {

	public static final String[] names = { "Kylie", "James", "Julie" };

	public static AbstractCustomer getCustomer(String name) {

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name) && names[i] != null) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}

public class RealCustomer extends AbstractCustomer{

}

public class NullCustomer extends AbstractCustomer{

}


```
