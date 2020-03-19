package templatemethodexample;

public class FarmHouse extends HouseTemplate {

	@Override
	public void houseTypeName() {
		// TODO Auto-generated method stub
		System.out.println("FarmHouse");
	}

	@Override
	public void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Concrete Walls");
	}

	@Override
	public void placePillars() {
		// TODO Auto-generated method stub
		System.out.println("Place Pillars to Farm House");
	}

}
