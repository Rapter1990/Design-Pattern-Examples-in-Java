package stateexample;

import java.io.Serializable;

public abstract class Gear implements Serializable{

	private int gearNumber;

	public Gear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gear(int gearNumber) {
		super();
		this.gearNumber = gearNumber;
	}

	public int getGearNumber() {
		return gearNumber;
	}

	public void setGearNumber(int gearNumber) {
		this.gearNumber = gearNumber;
	}

	@Override
	public String toString() {
		return "Gear [gearNumber=" + gearNumber + "]";
	}
	
}
