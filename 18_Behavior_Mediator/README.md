### Behavior Design Pattern - Mediator

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/mediator.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Mediator</td>
    <td>Interact with colleague objects</td>
  </tr>
  <tr>
    <td>ConcreteMediator</td>
    <td>Implement mediator and maintain references to colleague objects</td>
  </tr>
  <tr>
    <td>Colleague</td>
    <td>Make a communication with mediator</td>
  </tr>
  <tr>
    <td>ConcreteColleagueA,ConcreteColleagueB</td>
    <td>Implement colleague and handle with notification from mediator</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to seperate a group of objects with communicate each other. It also notifies mediator object about its changes with respect to its state. 

For example :

```
public abstract class AirlineBase {

}

public interface IAirport {

}

public class IstanbulAtaturkAirport implements IAirport {

}

public class THYAirline extends AirlineBase{

}

```

