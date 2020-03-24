### Behavior Design Pattern - Interpreter

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/proxy.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Client</td>
    <td>Use Subject to create RealSubject and ProxySubject</td>
  </tr>
  <tr>
    <td>Subject</td>
    <td>Define interface used by client</td>
  </tr>
  <tr>
    <td>RealSubject</td>
    <td>Provides real implementaion of subject</td>
  </tr>
  <tr>
    <td>ProxySubject</td>
    <td>Use a reference to RealSubject to provide actual functionality except for implementing same interface as a RealSubject</td>
  </tr>
  
</table>

<hr>
Description:
Proxy implements same interface as expected of real object and provides an object acting as a substitute for a real service object. It provides to create real object or it creates it when it is needed. It also controls to access objects method.  

For example :

```
public interface Internet { 

} 

public class RealInternet implements Internet { 

}

public class ProxyInternet implements Internet {
  private Internet internet;
  ....
}

public class InternetService {

	private Internet internet;
  ...
}


```

