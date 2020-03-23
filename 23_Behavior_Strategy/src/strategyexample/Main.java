package strategyexample;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product product1 = new Product();
		product1.setProductId("Product 1 Id");
		product1.setProductName("Product 1 Name");
		product1.setPrice(1);
		
		Product product2 = new Product();
		product2.setProductId("Product 2 Id");
		product2.setProductName("Product 2 Name");
		product2.setPrice(2);
		
		Product product3 = new Product();
		product3.setProductId("Product 3 Id");
		product3.setProductName("Product 3 Name");
		product3.setPrice(3);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.addProduct(product3);
		
		CreditCardStrategy creditcard = new CreditCardStrategy();
		creditcard.setUsername("Credit Card Username");
		creditcard.setCardNumber("12345678");
		creditcard.setCvv("321");
		creditcard.setDateOfExpiry("12/23");
		
		CashStrategy cash = new CashStrategy();
		cash.setCashPayment("Cash");
		
		shoppingCart.pay(creditcard);
		
		shoppingCart.pay(cash);
	}
}
