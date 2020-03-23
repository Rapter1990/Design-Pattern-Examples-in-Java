package strategyexample;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> productList = new ArrayList<>();

	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCart(List<Product> productList) {
		super();
		this.productList = productList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	public void addProduct(Product product){
		productList.add(product);
	}
	
	public void removeProduct(Product product){
		productList.remove(product);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Product product : productList){
			sum += product.getPrice();
		}
		return sum;
	}
	
	public void pay(IPaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

	@Override
	public String toString() {
		return "ShoppingCart [productList=" + productList + "]";
	}
	
	
}
