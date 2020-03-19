package templatemethodexample;

public class MansionHouse extends HouseTemplate {

	@Override
	public void houseTypeName() {
		// TODO Auto-generated method stub
		System.out.println("MansionHouse");
	}

	@Override
	public void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Concrete Wall");
	}

	@Override
	public void placePillars() {
		// TODO Auto-generated method stub
		System.out.println("Place Pillars to Mansion House");
	}

}
