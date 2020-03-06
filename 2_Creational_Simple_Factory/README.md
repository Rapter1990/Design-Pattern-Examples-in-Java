### Creational Design Pattern - Simple Factoy

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/creational_builder.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Director</td>
    <td>Use Builder to construct the object as it knows every steps of the way that the object is created</td>
  </tr>
  <tr>
    <td>Builder</td>
    <td>Provide an interface to create the parts of the final object </td>
  </tr>
  <tr>
    <td>Concreate Builder</td>
    <td>Create the parts of the final object and assemble them</td>
  </tr>
  <tr>
    <td>Product</td>
    <td>It is a final object which we want to create in client side</td>
  </tr>
</table>

<hr>
The aim of the usage of the builder is to follow steps with understandable functions to create object without having complicated in constructor part with uncertain variables. That means that creating object with parameters in main activity cannot be recognized from any user because of not figuring out variables like this shown belown.
For example :

```
Car car = new Car("Car Name",10,"Red"); 
```

Therefore, we want to use more comprehensible methods for users to understand them and we use builder to create object like this shown belown.
```
Car car = carBuilder.withCarName("Car Name").withAge(10).withColor("Red");
```
