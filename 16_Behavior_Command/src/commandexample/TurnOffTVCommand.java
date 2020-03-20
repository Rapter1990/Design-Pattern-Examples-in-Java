package commandexample;

public class TurnOffTVCommand implements ICommand {

	TVControl tvControl;

	public TurnOffTVCommand(TVControl tvControl) {
		super();
		this.tvControl = tvControl;
	}

	public void execute() {
		tvControl.turnOn();
	}
}
