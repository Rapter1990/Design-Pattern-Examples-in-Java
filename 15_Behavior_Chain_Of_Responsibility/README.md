### Behavior Design Pattern - Chain Of Responsibility

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/chainofresponsibility.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Deliver request to first object in defined chain</td>
  </tr>
  <tr>
    <td>Handler</td>
    <td>Define interface to handle with requests and implemets link to successor</td>
  </tr>
  <tr>
    <td>ConcreteHandlerA,ConcreteHandlerB,ConcreteHandlerC</td>
    <td>Handle requests if it can otherwise it delivers it to its successor</td>
  </tr>
 
</table>

<hr>
Description:
This design pattern is used when we want to seperate request from object tackling with request. Seperating request means that we want to give multiple objects to take a chance for handling with request. If the request can be handled, concretehandler processes this request otherwise it delivers its request to its successor.   

For example :

```
public class PlanetRequest {

}

public interface IPlanet {

}

public class MarsPlanet extends PlanetRequest implements IPlanet{
  private IPlanet handler;
}

public class VenusPlanet extends PlanetRequest implements IPlanet{
  private IPlanet handler;
}

```

