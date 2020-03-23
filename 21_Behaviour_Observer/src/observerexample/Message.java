package observerexample;

public class Message {
	String messageContent;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String messageContent) {
		super();
		this.messageContent = messageContent;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	@Override
	public String toString() {
		return "Message [messageContent=" + messageContent + "]";
	}
	
	
}
