### Creational Design Pattern - Simple Factoy

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/factory.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Call simplefactoy class to create product </td>
  </tr>
  <tr>
    <td>SimpleFactory</td>
    <td>Define a static method to get instance of product's subclass with respect to defined situation</td>
  </tr>
  <tr>
    <td>Product</td>
    <td>The main of subclasses</td>
  </tr>
  <tr>
    <td>Product A, Product B</td>
    <td>Create an object in terms of its feature</td>
  </tr>
</table>

<hr>
Simple Factory is used to determine the object which will instantiate regarding its type by creating a static method in a only one defining class to create anything. It also needs only a static method but addition of new product means changing existing code
For example :

```
public class Factory{
   public static Product getProduct(String type) {
      if(type.equalsIgnoreCase("value1")) {
              return new ProductA();
      } else if (type.equalsIgnoreCase("value2") {
              return new ProductB();
      }
        throw new IllegalArgumentException("Cannot find the criteria");
   }
}
```

