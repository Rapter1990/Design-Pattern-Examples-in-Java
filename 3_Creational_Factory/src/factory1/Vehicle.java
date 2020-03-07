package factory1;

public abstract class Vehicle {

	private long id;
	private String plate;
	private int engineCapacity;
	private int numberOfSeat;
	private String color;
	private String modelYear;
	private String fuelType;
	private String gearType;
	private double fuelVolume;
	private int distance;
	
	public abstract double averageFuelLiterPerDistance();
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(long id, String plate, int engineCapacity, int numberOfSeat, String color, String modelYear,
			String fuelType, String gearType, double fuelVolume, int distance) {
		super();
		this.id = id;
		this.plate = plate;
		this.engineCapacity = engineCapacity;
		this.numberOfSeat = numberOfSeat;
		this.color = color;
		this.modelYear = modelYear;
		this.fuelType = fuelType;
		this.gearType = gearType;
		this.fuelVolume = fuelVolume;
		this.distance = distance;
	}
	
	public Vehicle(String plate, int engineCapacity, int numberOfSeat, String color, String modelYear, String fuelType,
			String gearType, double fuelVolume, int distance) {
		super();
		this.plate = plate;
		this.engineCapacity = engineCapacity;
		this.numberOfSeat = numberOfSeat;
		this.color = color;
		this.modelYear = modelYear;
		this.fuelType = fuelType;
		this.gearType = gearType;
		this.fuelVolume = fuelVolume;
		this.distance = distance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	
	public double getFuelVolume() {
		return fuelVolume;
	}

	public void setFuelVolume(double fuelVolume) {
		this.fuelVolume = fuelVolume;
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", plate=" + plate + ", engineCapacity=" + engineCapacity + ", numberOfSeat="
				+ numberOfSeat + ", color=" + color + ", modelYear=" + modelYear + ", fuelType=" + fuelType
				+ ", gearType=" + gearType + ", fuelVolume=" + fuelVolume + ", distance=" + distance + "]";
	}
	
}
