package adapterexample;

public class CryptDecyptAdapter implements Crypt{

	private Crypt cryptObject;

    public CryptDecyptAdapter(Crypt cryptObject){

        this.cryptObject = cryptObject;
    }

	@Override
	public void encrypt(String text) {
		// TODO Auto-generated method stub
		cryptObject.encrypt(text);
	}

	@Override
	public void decrypt(String text) {
		// TODO Auto-generated method stub
		cryptObject.decrypt(text);
	}

}
