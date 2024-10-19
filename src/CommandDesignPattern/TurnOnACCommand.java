package CommandDesignPattern;

public class TurnOnACCommand implements ICommand{
    AirConditioner ac;
    TurnOnACCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
        ac.setTemperature(24);
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
