package observerexample;

public class MessageSubscriberTwo implements Observer {

	String name;
	
	public MessageSubscriberTwo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MessageSubscriberTwo(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void showMessage(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberTwo : " + name + "  ----  "+ m.getMessageContent());
	}

}
