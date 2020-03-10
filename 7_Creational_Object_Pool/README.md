### Creational Design Pattern - Object Pool

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
// Jave program to illustrate 
// Object Pool Design Pattern 
abstract class ObjectPool<T> { 
    long deadTime; 
  
    Hashtable<T, Long> lock, unlock; 
  
    ObjectPool() 
    { 
        deadTime = 50000; // 50 seconds 
        lock = new Hashtable<T, Long>(); 
        unlock = new Hashtable<T, Long>(); 
    } 
  
    abstract T create(); 
  
    abstract boolean validate(T o); 
  
    abstract void dead(T o); 
  
    synchronized T takeOut() 
    { 
        long now = System.currentTimeMillis(); 
        T t; 
        if (unlock.size() > 0) { 
            Enumeration<T> e = unlock.keys(); 
            while (e.hasMoreElements()) { 
                t = e.nextElement(); 
                if ((now - unlock.get(t)) > deadTime) { 
                    // object has deadd 
                    unlock.remove(t); 
                    dead(t); 
                    t = null; 
                } 
                else { 
                    if (validate(t)) { 
                        unlock.remove(t); 
                        lock.put(t, now); 
                        return (t); 
                    } 
                    else { 
                        // object failed validation 
                        unlock.remove(t); 
                        dead(t); 
                        t = null; 
                    } 
                } 
            } 
        } 
        // no objects available, create a new one 
        t = create(); 
        lock.put(t, now); 
        return (t); 
    } 
    synchronized void takeIn(T t) 
    { 
        lock.remove(t); 
        unlock.put(t, System.currentTimeMillis()); 
    } 
}

class ConnectionPool extends ObjectPool<Connection> { 

}



```

