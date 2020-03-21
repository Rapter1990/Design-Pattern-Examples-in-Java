package chainofresponsibilityexample;

public class SaturnPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.SATURN) {
			System.out.println("SaturnPlanet handles " + request.getPlanetType());
			System.out.println("Saturn is 6th planet in our solar system.");
		}else {
			System.out.println("SaturnPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
