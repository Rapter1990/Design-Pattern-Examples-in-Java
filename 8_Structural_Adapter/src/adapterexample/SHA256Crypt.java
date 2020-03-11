package adapterexample;

public class SHA256Crypt implements Crypt{

	@Override
	public void encrypt(String text) {
		// TODO Auto-generated method stub
		System.out.println("SHA256Crypt encrypt is working" + text);
	}

	@Override
	public void decrypt(String text) {
		// TODO Auto-generated method stub
		System.out.println("SHA256Crypt decrypt is working" + text);
	}

}
