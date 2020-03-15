package proxyexample;

public class Main {

	public static void main(String[] args) {
		InternetService realInternetService = new InternetService(new RealInternet());
		InternetService proxyInternetService = new InternetService(new ProxyInternet());
		
		connectInternetAddressToInternetService(realInternetService);
		connectInternetAddressToInternetService(proxyInternetService);
	}

	private static void connectInternetAddressToInternetService(InternetService internetService) {
		// TODO Auto-generated method stub
		try {
			internetService.connectInternetAddress("abc.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
