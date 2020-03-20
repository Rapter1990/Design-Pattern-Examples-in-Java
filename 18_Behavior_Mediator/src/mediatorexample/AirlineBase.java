package mediatorexample;

public abstract class AirlineBase {
	
	public String FlightCode;
	public IAirport Airport;
	
	public AirlineBase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirlineBase(String flightCode, IAirport airport) {
		super();
		FlightCode = flightCode;
		Airport = airport;
	}

	public String getFlightCode() {
		return FlightCode;
	}

	public void setFlightCode(String flightCode) {
		FlightCode = flightCode;
	}

	public IAirport getAirport() {
		return Airport;
	}

	public void setAirport(IAirport airport) {
		Airport = airport;
	}
	
	public abstract void GetLandingPermission();
}
