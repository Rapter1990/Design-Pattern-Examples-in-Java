package chainofresponsibilityexample;

public class MercuryPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.MERCURY) {
			System.out.println("MercuryPlanet handles " + request.getPlanetType());
			System.out.println("Mercury is 1st planet in our solar system.");
		}else {
			System.out.println("MercuryPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}

}
