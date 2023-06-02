public class MainApp {
    public static void main(String[] args){
        Light livingRoomLight = new LivingRoomLight();
        Light kitchenLight = new KitchenLight();

        RemoteController remoteController = new RemoteController();

        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);
        remoteController.setCommand(lightOnCommand, lightOffCommand);
        remoteController.onButtonPushed();
        remoteController.offButtonPushed();

        Command lightOnCommand1 = new LightOnCommand(kitchenLight);
        Command lightOffCommand1 = new LightOffCommand(kitchenLight);
        remoteController.setCommand(lightOnCommand1, lightOffCommand1);
        remoteController.onButtonPushed();
        remoteController.offButtonPushed();
    }
}
