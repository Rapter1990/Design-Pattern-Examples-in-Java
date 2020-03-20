package mediatorexample;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, AirlineBase> planesList = getPlaneList();
		
		IstanbulAtaturkAirport airport = new IstanbulAtaturkAirport();
		airport.setPlanesList(planesList);
		
		THYAirline plane1 = new THYAirline();
		plane1.setFlightCode("THY1111");
		plane1.setAirport(airport);
		
		THYAirline plane2 = new THYAirline();
		plane2.setFlightCode("THY1114");
		plane2.setAirport(airport);
		
		plane1.GetLandingPermission();
		plane2.GetLandingPermission();
	}

	private static Map<String, AirlineBase> getPlaneList() {
		// TODO Auto-generated method stub
		Map<String, AirlineBase> planes = new HashMap<String, AirlineBase>();
		planes.put("THY1111", new THYAirline());
		planes.put("THY1112", new THYAirline());
		planes.put("THY1113", new THYAirline());
		return planes;
	}
}
