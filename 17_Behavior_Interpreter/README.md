### Behavior Design Pattern - Interpreter

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/interpreter.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Interpret operations</td>
  </tr>
  <tr>
    <td>Context</td>
    <td>Hold information needed by interpreter</td>
  </tr>
  <tr>
    <td>Terminal Experssion</td>
    <td>Implement interpret operation because of being leaf nodes</td>
  </tr>
  <tr>
    <td>Non Terminal Expression</td>
    <td>Contains other expressions</td>
  </tr>
  <tr>
    <td>Abstract Expression</td>
    <td>Interface for expression in tree and defines interpret operation</td>
  </tr>
  
</table>

<hr>
Description:
This design pattern is used to defne a language with rules. Each rule in the language interprets operation in the expression class. 

For example :

```
public interface Expression {

}

public class AndExpression implements Expression {

}

public class CaseExpression implements Expression {

}


```

