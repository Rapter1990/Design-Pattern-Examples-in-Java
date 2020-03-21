package chainofresponsibilityexample;

public class Main {

	public static void main(String[] args) {
		
		IPlanet chainOfPlanet = setUpChain();
		
		chainOfPlanet.handleRequest(new PlanetRequest(PlanetEnum.EARTH));
		System.out.println("-------------------------------------");
		chainOfPlanet.handleRequest(new PlanetRequest(PlanetEnum.VENUS));
		System.out.println("-------------------------------------");
		chainOfPlanet.handleRequest(new PlanetRequest(PlanetEnum.JUPITER));
		System.out.println("-------------------------------------");
		chainOfPlanet.handleRequest(new PlanetRequest(PlanetEnum.NEPTUNE));
	}
	
	public static IPlanet setUpChain() {
		IPlanet mercury = new MercuryPlanet();
		IPlanet venus = new VenusPlanet();
		IPlanet earth = new EarthPlanet();
		IPlanet mars = new MarsPlanet();
		IPlanet jupiter = new JupiterPlanet();
		IPlanet saturn = new SaturnPlanet();
		IPlanet uranus = new UranusPlanet();
		IPlanet neptune = new NeptunePlanet();

		mercury.setNext(venus);
		venus.setNext(earth);
		earth.setNext(mars);
		mars.setNext(jupiter);
		jupiter.setNext(saturn);
		saturn.setNext(uranus);
		uranus.setNext(neptune);

		return mercury;
	}
}
