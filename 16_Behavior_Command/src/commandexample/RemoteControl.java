package commandexample;

public class RemoteControl {

    ICommand command;
 
    public void setCommand(ICommand command) {
        this.command = command;
    }
    
    public ICommand getCommand() {
		return command;
	}

	public void buttonPressed() {
        command.execute();
    }
	
}
