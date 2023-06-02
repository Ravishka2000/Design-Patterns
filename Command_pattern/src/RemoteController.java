public class RemoteController {
    Command lightOnCommand;
    Command lightOffCommand;

    public void setCommand(Command lightOnCommand, Command lightOffCommand){
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
    }

    public void onButtonPushed(){
        lightOnCommand.execute();
    }

    public void offButtonPushed(){
        lightOffCommand.execute();
    }
}
