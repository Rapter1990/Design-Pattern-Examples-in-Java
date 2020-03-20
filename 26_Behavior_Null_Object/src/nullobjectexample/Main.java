package nullobjectexample;

public class Main {

	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Kylie");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Kenny");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("---------------Customers---------");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
