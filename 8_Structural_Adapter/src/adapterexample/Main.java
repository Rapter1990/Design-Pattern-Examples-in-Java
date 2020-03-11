package adapterexample;

public class Main {

	public static void main(String[] args) {
		
		Crypt crypt1 = new CryptDecyptAdapter(new MD5Crypt());
		crypt1.encrypt("Encrpt Text");
		crypt1.decrypt("Decrypt Text");
		
		Crypt crypt2 = new CryptDecyptAdapter(new SHA256Crypt());
		crypt2.encrypt("Encrpt Text");
		crypt2.decrypt("Decrypt Text");
		
	}
}
