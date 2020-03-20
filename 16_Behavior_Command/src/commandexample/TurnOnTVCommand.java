package commandexample;

public class TurnOnTVCommand implements ICommand {

	TVControl tvControl;

	public TurnOnTVCommand(TVControl tvControl) {
		super();
		this.tvControl = tvControl;
	}

	public void execute() {
		tvControl.turnOn();
	}
}
