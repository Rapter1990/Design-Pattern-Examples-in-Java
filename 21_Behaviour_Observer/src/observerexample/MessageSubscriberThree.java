package observerexample;

public class MessageSubscriberThree implements Observer {

	String name;
	
	public MessageSubscriberThree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MessageSubscriberThree(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void showMessage(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree : " + name + "  ----  "+ m.getMessageContent());
	}

}
