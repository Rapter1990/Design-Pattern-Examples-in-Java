package adapterexample;

public class MD5Crypt implements Crypt{

	@Override
	public void encrypt(String text) {
		// TODO Auto-generated method stub
		System.out.println("MD5Crypt encrypt is working" + text);
	}

	@Override
	public void decrypt(String text) {
		// TODO Auto-generated method stub
		System.out.println("MD5Crypt decrypt is working" + text);
	}

}
