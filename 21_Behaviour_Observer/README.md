### Behavior Design Pattern - Observer

![Image description](https://github.com/Rapter1990/Design-Pattern-Examples-in-Java/blob/master/images/observer.png)

<hr>
<h2>Figure Information</h2>

<table>
  <tr>
    <th>Use Case Name</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Subject</td>
    <td>Define interface to reigster one or more observers</td>
  </tr>
  <tr>
    <td>ConcreteSubject</td>
    <td>Send notification to observers when its state is changed</td>
  </tr>
  <tr>
    <td>Observer</td>
    <td>Define interface for objects getting notification when subject is changed</td>
  </tr>
  <tr>
    <td>ConcreteObserver</td>
    <td>Having a refernce for concrete observer</td>
  </tr>
  
</table>

<hr>
Description:

This design pattern is used to define one-to-many dependency between objects and provide notification for each one in case of its change of state 

For example :

```

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}

public interface  Observer {
    public void showMessage(Message m);
}

public class MessageSubscriberOne implements Observer {

}

public class MessageContext implements Subject {

	private List<Observer> observers = new ArrayList<>();
	private final Object MUTEX = new Object();
	private boolean changed;

	public MessageContext() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			if (!observers.contains(o))
				observers.add(o);
		}
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyUpdate(Message m) {
		// TODO Auto-generated method stub
		this.changed=true;
		synchronized (MUTEX) {
			if (!changed)
				return;
			observers = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observers) {
			obj.showMessage(m);
		}
	}
}

public class Message {

}

```
