### Structuarl Design Pattern - Adapter

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/objectpool.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>ObjectPool</td>
    <td>Provide a list of available objects and a collection of objects that have already been requested from the pool</td>
  </tr>
  <tr>
    <td>ReuablePool</td>
    <td>it is held in the object pool because it is expensive or slow to instantiate </td>
  </tr>
  <tr>
    <td>Client</td>
    <td>Use it to create an object of the ReuablePool type </td>
  </tr>
  
</table>

<hr>
Object pool is a container which contains some amount of objects. So, when an object is taken from the pool, it is not available in the pool until it is put back

For example :

```

```

