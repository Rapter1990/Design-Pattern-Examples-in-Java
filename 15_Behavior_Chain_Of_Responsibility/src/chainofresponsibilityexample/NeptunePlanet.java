package chainofresponsibilityexample;

public class NeptunePlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.NEPTUNE) {
			System.out.println("NeptunePlanet handles " + request.getPlanetType());
			System.out.println("Neptune is 8th planet in our solar system.");
		}else {
			System.out.println("NeptunePlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
