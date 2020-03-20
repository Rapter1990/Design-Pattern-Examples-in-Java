package commandexample;

public class TurnOnLightCommand implements ICommand {

	LightControl lightControl;

	public TurnOnLightCommand(LightControl lightControl) {
		super();
		this.lightControl = lightControl;
	}

	public void execute() {
		lightControl.turnOn();
	}
}
