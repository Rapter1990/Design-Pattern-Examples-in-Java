package chainofresponsibilityexample;

public class VenusPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.VENUS) {
			System.out.println("VenusPlanet handles " + request.getPlanetType());
			System.out.println("Venus is 2nd planet in our solar system.");
		}else {
			System.out.println("VenusPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}
