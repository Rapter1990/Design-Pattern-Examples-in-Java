package commandexample;

public class Main {

	public static void main(String[] args) {

		// Invoker
		RemoteControl remoteControl = new RemoteControl();

		// Receiver 1
		LightControl lightControl = new LightControl();

		// Receiver 2
		TVControl tvControl = new TVControl();

		// Command
		remoteControl.setCommand(new TurnOnLightCommand(lightControl));
		remoteControl.buttonPressed();
		remoteControl.setCommand(new TurnOffLightCommand(lightControl));
		remoteControl.buttonPressed();
		remoteControl.setCommand(new TurnOnTVCommand(tvControl));
		remoteControl.buttonPressed();
		remoteControl.setCommand(new TurnOffTVCommand(tvControl));
		remoteControl.buttonPressed();

	}
}
