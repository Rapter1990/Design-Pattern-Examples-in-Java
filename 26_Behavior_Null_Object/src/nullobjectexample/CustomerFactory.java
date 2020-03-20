package nullobjectexample;

public class CustomerFactory {

	public static final String[] names = { "Kylie", "James", "Julie" };

	public static AbstractCustomer getCustomer(String name) {

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name) && names[i] != null) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
