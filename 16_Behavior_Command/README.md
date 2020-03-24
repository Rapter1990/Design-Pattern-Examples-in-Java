### Behavior Design Pattern - Command

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/command.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Create concrete command and assign its receiver</td>
  </tr>
  <tr>
    <td>Invoker</td>
    <td>Excute command</td>
  </tr>
  <tr>
    <td>Command</td>
    <td>Define interface to execute the operation</td>
  </tr>
  <tr>
    <td>Receiver</td>
    <td>Perform operation defined in request</td>
  </tr>
  <tr>
    <td>Concrete Command</td>
    <td>Make a communication between receiver and action and implement execute operation coming from receiver</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern provides us with treating requests for operations and sending them o different kinds of code for later execution.

For example :

```
public interface ICommand {

}

public class LightControl {

}

public class TurnOffLightCommand implements ICommand {

}

public class TurnOffLightCommand implements ICommand {

}

public class RemoteControl {
     ICommand command;
}


```

