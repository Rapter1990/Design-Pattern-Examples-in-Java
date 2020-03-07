### Creational Design Pattern - Factory Method

![Image description](https://github.com/Rapter1990/Design-Pattren-Examples-in-Java/blob/master/images/factorymethod.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Product</td>
    <td>An abstarct class or interface of product which is created from factory method </td>
  </tr>
  <tr>
    <td>Product A,B</td>
    <td>A sublass which implements or extends product class</td>
  </tr>
  <tr>
    <td>Creator</td>
    <td>Define abstract factory method and extra factory method to create product </td>
  </tr>
  <tr>
    <td>Creator A,B</td>
    <td>Use factory method to get back one instance of creating product</td>
  </tr>
</table>

<hr>
Factory Pattern is used to create each sub class concerning its main type separately via creator posing main type.Factory method needs a subclass per product subclass but it is used forfuture-proof. That means that there are a lot of vehicle to be defined in the application later so we can use it. For example :
```
abstract class VehicleFactory{
    public Vehicle getVehicle() {
        Vehicle vehicle = createVehicle();
        return vehicle;
    }
    protected abstract Vehicle createVehicle();
}
class CarFactory extends VehicleFactory {
    protected Vehicle createVehicle() {
        return new Car();
    }
}
class TruckFactory extends VehicleFactory {
    protected Vehicle createVehicle() {
        return new Truck();
    }
}
```

