package chainofresponsibilityexample;

public class JupiterPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.JUPITER) {
			System.out.println("JupiterPlanet handles " + request.getPlanetType());
			System.out.println("Jupiter is 5th planet in our solar system.");
		}else {
			System.out.println("JupiterPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
