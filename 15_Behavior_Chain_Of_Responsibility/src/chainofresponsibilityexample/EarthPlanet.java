package chainofresponsibilityexample;

public class EarthPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.EARTH) {
			System.out.println("EarthPlanet handles " + request.getPlanetType());
			System.out.println("Earth is 3rd planet in our solar system.");
		}else {
			System.out.println("EarthPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
