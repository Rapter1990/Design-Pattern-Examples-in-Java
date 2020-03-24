### Behavior Design Pattern - Iterator

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/iterator.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Use both aggregate and iterator</td>
  </tr>
  <tr>
    <td>Aggregate</td>
    <td>Define interface to create iterator</td>
  </tr>
  <tr>
    <td>Iterator</td>
    <td>Give interface to a role as if it was an iterator object and iterate elements of aggregate</td>
  </tr>
  <tr>
    <td>ConcreteAggregate</td>
    <td>Implements method to return object of iterator</td>
  </tr>
  <tr>
    <td>ConcreteIterator</td>
    <td>Implement iterator interface and has a state to remember its position</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to iterate or give a sequential access to element of aggregate object. It also determines if there is an convenient lement of iterator to consume and give next one.

For example :

```
public abstract class Person {

}


public class Employee extends Person{

}

public interface Iterator<T> {

    void reset();   // reset to the first element
    
    T next();   // To get the next element
 
    T currentItem();    // To retrieve the current element
 
    boolean hasNext();  // To check whether there is any next element or not.
}

public interface List<T>{
    Iterator<T> iterator();
}


public class EmployeeIterator implements Iterator<Employee> {

}

public class EmployeeList implements List<Employee>{

}


```
