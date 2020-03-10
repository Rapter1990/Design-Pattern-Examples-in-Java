### Creational Design Pattern - Singleton

![Image description](https://github.com/Rapter1990/Software-Design-Pattren-Examples-in-Java/blob/master/images/singleton.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>SingletonObject</td>
    <td>Provide a static method to get its static instance coming from Main</td>
  </tr>
  <tr>
    <td>Main</td>
    <td>Use it to get a SingletonObject object </td>
  </tr>
  
</table>

<hr>
Singleton pattern is used when just only one instance of a class exists in your app.Because of the usage of private constructor in Singleton object, it blocks the feature of inheritance and providing static method getting back a singleton object.

EagerInitializedSingleton : As soon as an instance is loaded by constructor , it is created. Instance is created even though client application cannot use it.

LazyInitializedSingleton : it is created after it is requested by client.

ThreadSafeSingleton :  it enables to make the global access method synchronized, so that only one thread can execute this method at a time.

EnumSingleton : As Java Enum values are globally accessible, so it is defined as the singleton.Any enum value is instantiated only once in a Java program

For example :

```
public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}


public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
}


public enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){
        //do something
    }
}


```

