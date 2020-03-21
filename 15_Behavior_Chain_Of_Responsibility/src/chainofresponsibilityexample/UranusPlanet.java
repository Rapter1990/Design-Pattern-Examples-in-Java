package chainofresponsibilityexample;

public class UranusPlanet extends PlanetRequest implements IPlanet{

	private IPlanet handler;
	
	@Override
	public void handleRequest(PlanetRequest request) {
		// TODO Auto-generated method stub
		if(request.getPlanetType() == PlanetEnum.URANUS) {
			System.out.println("UranusPlanet handles " + request.getPlanetType());
			System.out.println("Uranus is 7th planet in our solar system.");
		}else {
			System.out.println("UranusPlanet cannot handles " + request.getPlanetType());
			handler.handleRequest(request);
		}
	}

	@Override
	public void setNext(IPlanet nextInChain) {
		// TODO Auto-generated method stub
		handler = nextInChain;
	}
}

