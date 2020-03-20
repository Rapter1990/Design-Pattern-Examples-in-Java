package mediatorexample;

import java.util.Map;

public class IstanbulAtaturkAirport implements IAirport {

	private Map<String, AirlineBase> planesList;

	
	public IstanbulAtaturkAirport() {
		super();
	}

	public IstanbulAtaturkAirport(Map<String, AirlineBase> planesList) {
		super();
		this.planesList = planesList;
	}

	@Override
	public void Register(AirlineBase airline) {
		// TODO Auto-generated method stub
		if (planesList.containsValue(airline)) {
			planesList.put(airline.getFlightCode(), airline);
		}
		
		airline.setAirport(this);
	}

	@Override
	public boolean GiveLandingPermission(String flightCode) {
		// TODO Auto-generated method stub
		if (planesList.containsKey(flightCode)) {
			return true;
		}else {
			return false;
		}
	}

	public Map<String, AirlineBase> getPlanesList() {
		return planesList;
	}

	public void setPlanesList(Map<String, AirlineBase> planesList) {
		this.planesList = planesList;
	}
	

}
