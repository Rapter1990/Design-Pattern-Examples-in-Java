package chainofresponsibilityexample;

public class PlanetRequest {
	
	private PlanetEnum planetType;

	public PlanetRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PlanetRequest(PlanetEnum planetType) {
		super();
		this.planetType = planetType;
	}

	public PlanetEnum getPlanetType() {
		return planetType;
	}

	public void setPlanetType(PlanetEnum planetType) {
		this.planetType = planetType;
	}

}
