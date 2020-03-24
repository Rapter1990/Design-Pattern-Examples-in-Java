### Behavior Design Pattern - Strategy

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/strategy.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Context</td>
    <td>Use strategy interface to provide operation</td>
  </tr>
  <tr>
    <td>Strategy</td>
    <td>Define interface to implement its methods</td>
  </tr>
  <tr>
    <td>ConcreteStrategyA,ConcreteStrategyB</td>
    <td>Implement the methods of Strategy</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to encapsulate methods in seperate classes and each class having it methods is defined with the desired implmentation of method. 

For example :

```
public interface IPaymentStrategy {
	public void pay(int amount);
}

public class CreditCardStrategy implements IPaymentStrategy{

}

public class CashStrategy implements IPaymentStrategy{

}

public class Product {

}

public class ShoppingCart {

}


```
