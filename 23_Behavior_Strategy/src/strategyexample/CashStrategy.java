package strategyexample;

public class CashStrategy implements IPaymentStrategy{
	String cashPayment;

	public CashStrategy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CashStrategy(String cashPayment) {
		super();
		this.cashPayment = cashPayment;
	}

	public String getCashPayment() {
		return cashPayment;
	}

	public void setCashPayment(String cashPayment) {
		this.cashPayment = cashPayment;
	}

	@Override
	public String toString() {
		return "CashStrategy [cashPayment=" + cashPayment + "]";
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " amount paid by " + cashPayment);
	}
	
	
}
