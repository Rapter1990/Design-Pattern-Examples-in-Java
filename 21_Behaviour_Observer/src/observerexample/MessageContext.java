package observerexample;

import java.util.ArrayList;
import java.util.List;

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
