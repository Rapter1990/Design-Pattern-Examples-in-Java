package mediatorexample;

public interface IAirport {

	public void Register(AirlineBase airline);
    public boolean GiveLandingPermission(String flightCode);
}
