### Structural Design Pattern - Composite

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/composite.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Work with object in the structure of hierarchy by using component interface</td>
  </tr>
  <tr>
    <td>Component</td>
    <td>Define common behavior to access its children</td>
  </tr>
  <tr>
    <td>Leaf</td>
    <td>Represent the behaviour of primitive object</td>
  </tr>
  <tr>
    <td>Composite</td>
    <td>Store child components</td>
  </tr>
  
</table>

<hr>
Description : 
The composition pattern is used to simplify dealing with object arrangements. It delegates the operations to its children while leaf nodes implement the functionality. It simplifies the client node by treating the composites and leaf nodes in the same way.


For example :

```
public interface Employee { 

} 

public class Designer implements Employee {

}

public class Developer implements Employee {

}

public class StartUpDirectory implements Employee {

private List<Employee> employeeList = new ArrayList<Employee>(); 

showDetails()
addEmployee()
removeEmployee()
}

```

