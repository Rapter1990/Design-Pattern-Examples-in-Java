package observerexample;

public class Main {

	public static void main(String[] args) {
		
		// subject
		MessageContext messageContext = new MessageContext();
		
		// observer
		Observer obj1 = new MessageSubscriberOne("obj1");
		Observer obj2 = new MessageSubscriberTwo("obj2");
		Observer obj3 = new MessageSubscriberThree("obj3");
		
		// attach obj1 and obj2 observers to the subject
		messageContext.attach(obj1);
		messageContext.attach(obj2);
		
		messageContext.notifyUpdate(new Message("First Message"));   //obj1 and obj2 will receive the update
		
		// detach obj2 from the subject
		messageContext.detach(obj2);
		
		// attach obj3 observers to the subject
		messageContext.attach(obj3);
		
		messageContext.notifyUpdate(new Message("Second Message")); //obj1 and obj3 will receive the update
	}
}
