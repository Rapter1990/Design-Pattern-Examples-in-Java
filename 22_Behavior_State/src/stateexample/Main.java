package stateexample;

public class Main {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();

		vehicle.accelarate(18);

		vehicle.setGearState(new FirstGear());
		vehicle.changeGear();

		System.out.println(vehicle);
		vehicle.accelarate(30);
		vehicle.accelarate(18);

		vehicle.setGearState(new SecondGear());
		vehicle.changeGear();

		System.out.println(vehicle);
		vehicle.accelarate(35);
		vehicle.accelarate(60);
		
		vehicle.setGearState(new ThirdGear());
		vehicle.changeGear();
		
		System.out.println(vehicle);
		vehicle.accelarate(65);
		vehicle.accelarate(55);
		
		vehicle.setGearState(new FourthGear());
		vehicle.changeGear();
		
		
		System.out.println(vehicle);
		vehicle.accelarate(70);
		vehicle.accelarate(85);
		
		vehicle.setGearState(new FifthGear());
		vehicle.changeGear();
		
		
		System.out.println(vehicle);
		vehicle.accelarate(90);
		vehicle.accelarate(100);
		
		vehicle.setGearState(new FifthGear());
		vehicle.changeGear();
	}
}
