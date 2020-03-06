### Creational Design Pattern - Builder

The aim of the usage of the builder is to follow steps with understandable functions to create object without having complicated in constructor part with uncertain variables. That means that creating object with parameters in main activity cannot be recognized from any user because of not figuring out variables like this shown belown.
For example :
```
Car car = new Car("Car Name",10,"Red"); 
```

Therefore, we want to use more comprehensible methods for users to understand them and we use builder to create object like this shown belown.
```
Car car = carBuilder.withCarName("Car Name").withAge(10).withColor("Red");
```
