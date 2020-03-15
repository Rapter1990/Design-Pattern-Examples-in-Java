package proxyexample;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet;
	private List<String> bannedSites;

	public ProxyInternet() {
		this.internet = new RealInternet();
		bannedSites = getAllSites();
	}

	private List<String> getAllSites() {
		// TODO Auto-generated method stub
		bannedSites = new ArrayList<String>(); 
        bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
        
        return bannedSites;
	}

	@Override
	public void connectTo(String serverhost) throws Exception {

		if (bannedSites.contains(serverhost.toLowerCase())) {
			System.out.println("Proxy Internet : Connecting to " + serverhost);
		}else {
			internet.connectTo(serverhost);
		}

	}
}
