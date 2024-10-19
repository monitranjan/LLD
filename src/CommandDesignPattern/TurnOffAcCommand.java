package CommandDesignPattern;

public class TurnOffAcCommand implements ICommand{
    AirConditioner ac;

    TurnOffAcCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
