package templatemethodexample;

public class Main {

	public static void main(String[] args) {
		
		HouseTemplate bungalowType = new BungalowHouse();
		HouseTemplate mansionType = new MansionHouse();
		HouseTemplate apartmanType = new ApartmanHouse();
		HouseTemplate villaHouse = new VillaHouse();
		HouseTemplate farmType = new FarmHouse();
		
		//using template method
		bungalowType.buildHouse();
		System.out.println("************");
		
		mansionType.buildHouse();
		System.out.println("************");
		
		apartmanType.buildHouse();
		System.out.println("************");
		
		villaHouse.buildHouse();
		System.out.println("************");
		
		farmType.buildHouse();
		System.out.println("************");
		
	}
}
