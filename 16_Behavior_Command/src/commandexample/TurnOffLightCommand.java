package commandexample;

public class TurnOffLightCommand implements ICommand {

	LightControl lightControl;

	public TurnOffLightCommand(LightControl lightControl) {
		super();
		this.lightControl = lightControl;
	}

	public void execute() {
		lightControl.turnOff();
	}
}
