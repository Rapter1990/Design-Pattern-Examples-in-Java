### Structural Design Pattern - Facade

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/facade.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Facade</td>
    <td>Interacts with subsystem classes to perform client request</td>
  </tr>
  <tr>
    <td>Package 1,2</td>
    <td>Combine their own classes together implement their functionality</td>
  </tr>
  
</table>

<hr>
Description :
Facade is used when subsystem requires dealing with a lots of classes and interfaces for client. It also provides a simple interface which provides same functionality.

For example :

```

public class OracleDatabaseHelper {

}

public class MysqlHelper {

}

public class PostgreHelper {

}

public class DatabaseFacadeHelper {

  public static void generateConnection(dbType){
    switch (dbType){
      case MYSQL:
          ....
          break;
      case ORACLE:
          ....
          break;
      case POSTGRE:
          ....
          break;    
    }    
}

```

