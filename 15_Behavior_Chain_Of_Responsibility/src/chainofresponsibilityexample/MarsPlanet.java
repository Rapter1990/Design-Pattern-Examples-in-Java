package chainofresponsibilityexample;

public class MarsPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.MARS) {
			System.out.println("MarsPlanet handles " + request.getPlanetType());
			System.out.println("Mars is 4th planet in our solar system.");
		}else {
			System.out.println("MarsPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
