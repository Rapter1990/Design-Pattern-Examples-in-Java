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

