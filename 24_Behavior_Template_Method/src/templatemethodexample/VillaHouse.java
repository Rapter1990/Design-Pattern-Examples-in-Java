package templatemethodexample;

public class VillaHouse extends HouseTemplate {

	@Override
	public void houseTypeName() {
		// TODO Auto-generated method stub
		System.out.println("VillaHouse");
	}

	@Override
	public void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Concrete Walls");
	}

	@Override
	public void placePillars() {
		// TODO Auto-generated method stub
		System.out.println("Place Pillars to Villa House");
	}

}
