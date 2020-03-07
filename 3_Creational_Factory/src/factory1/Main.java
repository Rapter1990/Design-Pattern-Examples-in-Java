package factory1;

public class Main {

	public static void main(String[] args) {
		
		VehicleFactory carFactory = new CarFactory();
		VehicleFactory truckFactory = new TruckFactory();
		
		Car car = (Car) createVehicle(new Car(),carFactory);
		Truck truck = (Truck) createVehicle(new Truck(),truckFactory);
		
		showInformation(car);
		System.out.println();
		showInformation(truck);
	}


	private static Vehicle createVehicle(Vehicle vehicle, VehicleFactory vehicleFactory) {
		// TODO Auto-generated method stub
		if(vehicle instanceof Car ) {
			vehicle = (Car) vehicleFactory.constructVehicle();
			vehicle.setId(123456);
			vehicle.setModelYear("2014");
			vehicle.setColor("Red");
			vehicle.setEngineCapacity(3000);
			vehicle.setFuelType("Gasoline");
			vehicle.setNumberOfSeat(4);
			vehicle.setDistance(150);
			vehicle.setFuelVolume(62.5);
			vehicle.setGearType("4");
			vehicle.setPlate("CAR Plate A");
			
		}else if(vehicle instanceof Truck) {
			vehicle = (Truck) vehicleFactory.constructVehicle();
			vehicle.setId(123456);
			vehicle.setModelYear("2012");
			vehicle.setColor("Black");
			vehicle.setEngineCapacity(4500);
			vehicle.setFuelType("Flez Fuel");
			vehicle.setNumberOfSeat(2);
			vehicle.setDistance(200);
			vehicle.setFuelVolume(150.5);
			vehicle.setGearType("12");
			vehicle.setPlate("TRUCK Plate B");
			
		}else {
			
			vehicle = null;
		} 
		
		return vehicle;
	}
	
	private static void showInformation(Vehicle vehicle) {
		// TODO Auto-generated method stub
		String vehicleSituation = "";
		if(vehicle instanceof Car ) {
			vehicleSituation = "Car";
		}else {
			vehicleSituation = "Truck";
		}
		System.out.println("Vehicle Information");
		System.out.println(vehicleSituation + " Id : " + vehicle.getId());
		System.out.println(vehicleSituation + " Model Year : " + vehicle.getModelYear() );
		System.out.println(vehicleSituation + " Color : " + vehicle.getColor() );
		System.out.println(vehicleSituation + " Engine Capacity : " + vehicle.getEngineCapacity() );
		System.out.println(vehicleSituation + " Fuel Type : " + vehicle.getFuelType() );
		System.out.println(vehicleSituation + " Number Of Seat : " + vehicle.getNumberOfSeat() );
		System.out.println(vehicleSituation + " Distance : " + vehicle.getDistance() );
		System.out.println(vehicleSituation + " Fuel Volume : " + vehicle.getFuelVolume() );
		System.out.println(vehicleSituation + " Gear Type : " + vehicle.getGearType() );
		System.out.println(vehicleSituation + " Plate : " + vehicle.getPlate() );
		System.out.println(vehicleSituation + " Average FuelLiter Per Distance : " + vehicle.averageFuelLiterPerDistance() );
	}
}
