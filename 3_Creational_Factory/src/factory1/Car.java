package factory1;

public class Car extends Vehicle{

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(long id, String plate, int engineCapacity, int numberOfSeat, String color, String modelYear,
			String fuelType, String gearType, double fuelVolume, int distance) {
		super(id, plate, engineCapacity, numberOfSeat, color, modelYear, fuelType, gearType, fuelVolume, distance);
		// TODO Auto-generated constructor stub
	}

	public Car(String plate, int engineCapacity, int numberOfSeat, String color, String modelYear, String fuelType,
			String gearType, double fuelVolume, int distance) {
		super(plate, engineCapacity, numberOfSeat, color, modelYear, fuelType, gearType, fuelVolume, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double averageFuelLiterPerDistance() {
		// TODO Auto-generated method stub
		return super.getFuelVolume() * 100 / super.getDistance();
	}
}
