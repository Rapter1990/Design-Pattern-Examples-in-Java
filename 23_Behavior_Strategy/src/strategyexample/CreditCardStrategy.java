package strategyexample;

public class CreditCardStrategy implements IPaymentStrategy{
	
	private String username;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCardStrategy(String username, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.username = username;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public String toString() {
		return "CreditCardStrategy [username=" + username + ", cardNumber=" + cardNumber + ", cvv=" + cvv
				+ ", dateOfExpiry=" + dateOfExpiry + "]";
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " amount paid by Credit Card");
	}
	
	
}
