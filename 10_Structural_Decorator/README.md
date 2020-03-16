### Structural Design Pattern - Decorator

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/decorator.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Create Decorator Component</td>
  </tr>
  <tr>
    <td>Component</td>
    <td>Define interface used by Client</td>
  </tr>
  <tr>
    <td>ConcreateComponent</td>
    <td>Plain object to be decorated</td>
  </tr>
  <tr>
    <td>Decorator</td>
    <td>Use a reference to component expect for providing extra behaviour</td>
  </tr>
  
</table>

<hr>
Description : 

This pattern is used if small behaviour of object can be added. It provides us to create object dynamically by using composition. It 
can wrap another decorator wrapping original object. It has same interface as the object to be created.
For example :

```

public interface Car {

}

public class CarObject implements Car {

}

public class CarDecorator implements Car {

}

public class PassengerCar extends CarDecorator {

}

public class DecoratorPatternMain {
...
Car sportsLuxuryCar = new PassengerCar(new CarObject());
...
}
```

