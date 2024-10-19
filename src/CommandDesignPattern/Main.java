package CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        //Ac Object
        AirConditioner airConditioner = new AirConditioner();
        //Remote
        RemoteControl remoteControl = new RemoteControl();

        //create command and press button
        remoteControl.setCommand(new TurnOnACCommand(airConditioner));
        remoteControl.pressButton();

        //undo the last operation
        remoteControl.undo();
    }
}
