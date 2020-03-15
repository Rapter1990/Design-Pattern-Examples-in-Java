package proxyexample;

public class RealInternet implements Internet { 
	
    @Override
    public void connectTo(String serverhost) { 
        System.out.println("Real Internet : Not Connecting to "+ serverhost); 
    } 
} 
