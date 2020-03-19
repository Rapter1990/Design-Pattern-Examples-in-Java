package templatemethodexample;

public abstract class HouseTemplate {

	// template method
	public final void buildHouse() {
		houseTypeName();
		buildStart();
		placePillars();
		constructWalls();
		putWindows();
		System.out.println("House is completely built.");
	}

	// default implementation
	private void putWindows() {
		System.out.println("Putting Glass Windows");
	}

	// methods to be implemented by subclasses
	public abstract void constructWalls();

	public abstract void placePillars();
	
	public abstract void houseTypeName();

	private void buildStart() {
		System.out.println("Constructing starts with cement,iron rods and sand");
	}
}
