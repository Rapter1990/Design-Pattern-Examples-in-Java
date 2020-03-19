package stateexample;

public class Vehicle implements GearState {

	private GearState gear;

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		gear.changeGear();
	}

	public void setGearState(GearState sgear) {
		gear = sgear;
	}

	@Override
	public void accelarate(int speed) {
		// TODO Auto-generated method stub
		if (null == gear) {
			System.out.println("You couldn't sppend in Neutral Gear");
		} else {
			gear.accelarate(speed);
		}
	}

	@Override
	public String toString() {
		return "Vehicle [gear=" + gear + "]";
	}

}
