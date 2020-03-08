### Creational Design Pattern - Abstract Factory

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/abstract%20factory.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Main Class</td>
    <td>Create a instance of prototype object with using clone method </td>
  </tr>
  <tr>
    <td>Prototype</td>
    <td>Define a clone method to construct the same kind of its object</td>
  </tr>
  <tr>
    <td>ConcreatePrototypeA, ConcreatePrototypeB</td>
    <td>Implement clone method coming from its parent to create its clone </td>
  </tr>
</table>

<hr>
Abstract Factory creates supereme factory constructing its subs factories. This factory is also called as factory of factories. Because it is considered to one of thethe best ways to create an object , is is focused on under creational design. For example :

```
public interface Base {
   void function();
}

public class UpperBase implements Base {
   @Override
   public void function() {
      System.out.println("UpperBase is called");
   }
}

public class LowerBase implements Base {
   @Override
   public void function() {
      System.out.println("UpperBase is called");
   }
}

public abstract class BaseFactory {
   abstract Base getBase(String baseType) ;
}

public class UpperFactory extends AbstractFactory {
   @Override
   public Base getBase(String baseType){    
      if(baseType.equalsIgnoreCase("UpperBase")){
         return new UpperBase();         
      } 
      return null;
   }
}

public class LowerFactory extends AbstractFactory {
   @Override
   public Base getBase(String baseType){    
      if(baseType.equalsIgnoreCase("LowerBase")){
         return new LowerBase();         
      }
      return null;
   }
}

public class BaseProducer {
   public static AbstractFactory getFactory(String factoryType){   
      if(factoryType.equalsIgnoreCase("UpperFactory")){
         return new UpperFactory();         
      }else{
         return new LowerFactory();
      }
   }
}

```

