package CommandDesignPattern;

import java.util.Stack;

public class RemoteControl {
    ICommand command;
    Stack<ICommand> acCommandHistory = new Stack<>();
    RemoteControl(){}

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        acCommandHistory.push(command);
    }

    public void undo(){
        if(!acCommandHistory.isEmpty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}

