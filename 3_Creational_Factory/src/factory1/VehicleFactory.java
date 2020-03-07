package factory1;

public abstract class VehicleFactory {
	 
	Vehicle vehicle;
	public Vehicle constructVehicle() {
		System.out.println("Starting to construct vehicle");
		vehicle = createVehicle();
		System.out.println("Finished to construct vehicle");
		return vehicle;
	}
	protected abstract Vehicle createVehicle();
}
