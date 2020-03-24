### Behavior Design Pattern - State

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/state.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Context</td>
    <td>Deliver operation method with current state to its concreteState class</td>
  </tr>
  <tr>
    <td>State</td>
    <td>Define interface for objects representing state of object</td>
  </tr>
  <tr>
    <td>ConcreteStateA,ConcreteStateB</td>
    <td>Representing a particular state of object</td>
  </tr>
</table>

<hr>
Description:

This design pattern is used to change the behaviour state of object in terms of the case of its state. 

For example :

```
public abstract class Gear implements Serializable{

}

public interface GearState {
	public void changeGear();
	public void accelarate(int speed);
}

public class FirstGear extends Gear implements GearState {

}

public class SecondGear extends Gear implements GearState {

}

public class Vehicle implements GearState {

	private GearState gear;
	
}	



```
