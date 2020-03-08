### Creational Design Pattern - Prototype

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/prototype.png)

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
Prototype is a template of any object before the actual object is constructed. It means that it is based on creating duplicate object while keeping performance in constant. Therefore, it can create a number of instances of a class, which has almost same state or differs from some a few differences  For example :

```
public abstract class ClassName implements Cloneable {
    ....
    
    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
}
```

