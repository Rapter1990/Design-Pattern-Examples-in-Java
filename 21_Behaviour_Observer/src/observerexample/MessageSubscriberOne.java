package observerexample;

public class MessageSubscriberOne implements Observer {

	String name;
	
	public MessageSubscriberOne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MessageSubscriberOne(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showMessage(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberOne : " + name + "  ----  "+ m.getMessageContent());
	}

}
