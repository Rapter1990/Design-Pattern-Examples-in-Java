package objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

//Jave program to illustrate 
//Object Pool Design Pattern 
public abstract class ObjectPool<T> {
	long deadTime;

	Hashtable<T, Long> lock, unlock;

	ObjectPool() {
		deadTime = 50000; // 50 seconds
		lock = new Hashtable<T, Long>();
		unlock = new Hashtable<T, Long>();
	}

	abstract T create();

	abstract boolean validate(T o);

	abstract void dead(T o);

	synchronized T takeOut() {
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
				} else {
					if (validate(t)) {
						unlock.remove(t);
						lock.put(t, now);
						return (t);
					} else {
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

	synchronized void takeIn(T t) {
		lock.remove(t);
		unlock.put(t, System.currentTimeMillis());
	}
}
