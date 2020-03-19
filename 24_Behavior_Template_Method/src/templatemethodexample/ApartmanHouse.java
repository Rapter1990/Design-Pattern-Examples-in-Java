package templatemethodexample;

public class ApartmanHouse extends HouseTemplate {

	@Override
	public void houseTypeName() {
		// TODO Auto-generated method stub
		System.out.println("ApartmanHouse");
	}

	@Override
	public void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Building Long Concrete Walls");
	}

	@Override
	public void placePillars() {
		// TODO Auto-generated method stub
		System.out.println("Place Pillars to Apartman House");
	}


}
