package proxyexample;

public class InternetService {

	private Internet internet;

	public InternetService(Internet internet) {
		super();
		this.internet = internet;
	} 
	
    public void connectInternetAddress(String address) throws Exception {
    	internet.connectTo(address);
    }
}
