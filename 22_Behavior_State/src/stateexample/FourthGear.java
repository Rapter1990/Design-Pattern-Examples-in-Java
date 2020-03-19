package stateexample;

public class FourthGear extends Gear implements GearState {

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		super.setGearNumber(4);
	}

	@Override
	public void accelarate(int speed) {
		// TODO Auto-generated method stub
		if (speed > 80) {
			System.out.println("You couldn't drive at " + speed + " kmph in gear " + super.getGearNumber());
		} else {
			System.out.println("You could at " + speed + " kmph in gear " + super.getGearNumber());
		}
	}

	@Override
	public String toString() {
		String str = "You could drive in " + super.getGearNumber() + " gear.";
		return str;
	}

}
