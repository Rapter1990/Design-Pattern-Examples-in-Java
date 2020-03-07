package factory1;

public class TruckFactory extends VehicleFactory {
	 
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}
