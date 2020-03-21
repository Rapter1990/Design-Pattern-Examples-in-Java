package chainofresponsibilityexample;

public interface IPlanet {
	public void handleRequest(PlanetRequest request);
	public void setNext(IPlanet nextInChain);
}
